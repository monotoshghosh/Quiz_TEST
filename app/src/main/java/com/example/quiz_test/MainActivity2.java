package com.example.quiz_test;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //
    String[] que={"1. Is the sky typically Green during the day ?","2. Have you watched Nanja Hattori ?","3. Have you slept 7+ hrs last night ?","4. Is Orange is the colour of Orange ?","5. Have you enjoyed the Quizzzz.. ?"};
    boolean[] ans={false,true,true,true,true};

    TextView question;
    Button yes;
    Button no;
    TextView mark;
    int index=0;
    int score=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //
        yes=findViewById(R.id.button2);
        no=findViewById(R.id.button3);
        mark=findViewById(R.id.textView9);
        question=findViewById(R.id.textView7);

        question.setText(que[index]);
        mark.setText(String.valueOf(score));



        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < que.length){
                    if (ans[index]) {
                        score++;
                    }
                    index++;
                    if (index < que.length) {
                        question.setText(que[index]);
                        mark.setText(String.valueOf(score));
                    }
                    else{
                        mark.setText("Your Final Score is: " + score);
                    }
                }
                else{
                    mark.setText("Your Final Score is: " + score);
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < que.length){
                    if (!ans[index]) {
                        score++;
                    }
                    index++;
                    if (index < que.length) {
                        question.setText(que[index]);
                        mark.setText(String.valueOf(score));
                    }
                    else{
                        mark.setText("Your Final Score is: " + score);
                    }
                }
                else{
                    mark.setText("Your Final Score is: " + score);
                }
            }
        });
    }
}