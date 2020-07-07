package com.example.cameraapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b_c,b_g;
    ImageView iv;
    public static final int CAMERA_REQUEST_CODE = 22;
    public static final int GALLERY_REQUEST_CODE =33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_c=findViewById(R.id.cam);
        b_g=findViewById(R.id.gal);
        iv=findViewById(R.id.photo);
        b_c.setOnClickListener(this);
        b_g.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.cam:
                openCamera();
                break;
            case R.id.gal:
               openGallery();
                break;
        }

    }
    private void openGallery(){
        Intent i =new Intent();
        i.setType("image");
        i.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(i,GALLERY_REQUEST_CODE);
    }
    private void openCamera(){
        Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,CAMERA_REQUEST_CODE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode==CAMERA_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Bitmap b= (Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(b);
            }
        }
        if(requestCode == GALLERY_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Uri u= data.getData();
                iv.setImageURI(u);
            }
        }
    }

}