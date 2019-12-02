package com.arjun.uilibrary;

import android.os.Bundle;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.arjun.gradientmodule.GradientArtistBasic;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    GradientArtistBasic gradient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        gradient=(GradientArtistBasic) findViewById(R.id.gradientImage);
        gradient.setUrlImage("https://img1.etsystatic.com/002/0/6449624/il_fullxfull.382134677_so6e.jpg",R.drawable.weather,
                R.drawable.shubham, ImageView.ScaleType.CENTER_CROP);
    /*    gradient.setDrawableImage(R.drawable.shubham,R.drawable.weather,R.drawable.weather,
               ImageView.ScaleType.CENTER_CROP);*/
    }

}
