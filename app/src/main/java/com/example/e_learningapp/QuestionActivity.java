package com.example.e_learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {
EditText text;
Button btn;
TextView time;
public int counter;
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        text=(EditText)findViewById(R.id.edit_text);
        btn=(Button) findViewById(R.id.submit_btn);
        time=(TextView)findViewById(R.id.timer);
         TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                counter++;
            }
            @Override
            public void onFinish() {
                counttime.setText("Finished");
                text.setFocusable(false);
                time.setText("");
                btn.setVisibility(View.VISIBLE);
            }
        }.start();

    }
}