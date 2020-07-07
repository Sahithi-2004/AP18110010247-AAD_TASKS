package com.example.ass2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    int i = 0, j = 0;
    private Bundle outState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.score_a);
        t2 = findViewById(R.id.score_b);

        if(savedInstanceState!=null){
            String s= savedInstanceState.getString("sat");
            String a=savedInstanceState.getString("ash");
            t1.setText(s);
            t2.setText(a);
        }
    }


    public void aone(View view) {
        i = i + 1;
        t1.setText("" + i);
    }

    public void atwo(View view) {
        i = i + 2;
        t1.setText("" + i);
    }

    public void athree(View view) {
        i = i + 3;
        t1.setText("" + i);
    }

    public void bone(View view) {
        j = j + 1;
        t2.setText("" + j);
    }

    public void btwo(View view) {
        j = j + 2;
        t2.setText("" + j);
    }

    public void bthree(View view) {
        j = j + 3;
        t2.setText("" + j);
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("sat", t1.getText().toString());
        outState.putString("ash",t2.getText().toString());
    }

}