package com.example.quizbox;

import static com.example.quizbox.R.id.icon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class flashscreen extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView img;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent nextScreen=new Intent(flashscreen.this,MainActivity.class);
                startActivity(nextScreen);
                finish();
            }
        },1000);
        img=findViewById(R.id.icon);
        img.animate().rotation(1000).scaleXBy(0.2f).scaleYBy(0.2f).setDuration(1000);
    }
}