package com.example.quiz_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //


    }
    public void nextScr(View view){
        Toast.makeText(this, "Let's Get Started", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);


    }
}