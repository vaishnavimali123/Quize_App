package com.example.quizbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void shivaji_act(View view){
        Intent intent=new Intent(MainActivity.this,shivaji.class);
        startActivity(intent);
    }
    public void karmaveer_act(View view){
        Intent intent=new Intent(MainActivity.this,karmaveer.class);
        startActivity(intent);
    }
    public void jytotiba_act(View view){
        Intent intent=new Intent(MainActivity.this,jyotiba.class);
        startActivity(intent);
    }
}