package com.example.android.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RActivity extends AppCompatActivity {
    int likes=0;
    TextView counter;
    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);
        counter=(TextView) findViewById(R.id.mycounter);
        btn=(ImageButton) findViewById(R.id.Like);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                likes++;
                counter.setText(likes);
            }});{}
          }
    }
