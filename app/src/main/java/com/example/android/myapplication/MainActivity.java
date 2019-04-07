package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int Timesclicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button clicker= findViewById(R.id.clicker);
//        clickersetText("CLICK ME TO START TTHEGAEM OR ELSE");
//        TextView results= findViewById(R.id.results);
//        results.setText("YOU'VE CLICKED ME "+Timesclicked+" TIMES!");
//


    }


    public void like(View view) {
        TextView likes = findViewById(R.id.likes);
        likes.setText("You've liked me "+(++Timesclicked)+" Times");
    }
}
