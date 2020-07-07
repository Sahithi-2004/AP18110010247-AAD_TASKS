package com.example.ass3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view) {
        Intent l=new Intent(this,login.class);
        startActivity(l);
    }

    public void register(View view) {
        Intent r=new Intent(this,registrstion.class);
        startActivity(r);
    }

}