package com.example.ass3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registrstion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrstion);
    }
    public void back(View view) {
        Intent a=new Intent(this,MainActivity.class);
        startActivity(a);
    }
    public void display(View view) {
        Toast.makeText(this,"Registration is done!", Toast.LENGTH_SHORT).show();
    }
}