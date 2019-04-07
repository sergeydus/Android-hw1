
package com.example.android.myapplication;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RoiActivity extends AppCompatActivity {
    TextView numOL;
    ImageButton btn;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_roi);
        btn = (ImageButton) findViewById(R.id.mylikeRoi);
        numOL = (TextView) findViewById(R.id.numOfLikeRoi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOL.setText(++n + "like");
            }
        } );

    }


}
