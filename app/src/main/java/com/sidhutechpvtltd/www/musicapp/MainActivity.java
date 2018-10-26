package com.sidhutechpvtltd.www.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the songs list category.
        ImageView iconImage = (ImageView) findViewById(R.id.image_icon);
        // The code in this method will be executed when the play icon is clicked .
        iconImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, SongsList.class);
                startActivity(numbersIntent);
            }
        });
    }
}
