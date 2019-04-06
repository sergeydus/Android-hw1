package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainPageActivity extends AppCompatActivity {

    private Button ProfileButton1;
    private Button ProfileButton2;
    private Button ProfileButton3;
    private Button ProfileButton4;
    private Button ProfileButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ProfileButton1= (Button) findViewById(R.id.profile1Button);
        ProfileButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        ProfileButton2= (Button) findViewById(R.id.profile2Button);
        ProfileButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ProfileButton3= (Button) findViewById(R.id.profile3Button);
        ProfileButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        ProfileButton4= (Button) findViewById(R.id.profile4Button);
        ProfileButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        ProfileButton5= (Button) findViewById(R.id.profile5Button);
        ProfileButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }
    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, AActivity.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, RActivity.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
