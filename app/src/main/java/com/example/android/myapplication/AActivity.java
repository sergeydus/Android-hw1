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

public class AActivity extends AppCompatActivity {
    TextView Womanlikes;
    ImageButton wamenclicker;
    int WomanLikes=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        wamenclicker = findViewById(R.id.HeartA);
          Womanlikes= findViewById(R.id.numLikes);
        wamenclicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WomanLikes++;
            Womanlikes.setText("Likes: "+WomanLikes);

            }
        });
        }

    }


