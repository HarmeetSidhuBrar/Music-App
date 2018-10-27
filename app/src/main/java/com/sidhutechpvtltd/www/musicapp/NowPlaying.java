package com.sidhutechpvtltd.www.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        LinearLayout startSongsActivity = (LinearLayout) findViewById(R.id.jump_to_songs) ;
        startSongsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displaySongslist = new Intent(NowPlaying.this,SongsList.class);
                startActivity(displaySongslist);
            }
        });

    }



}
