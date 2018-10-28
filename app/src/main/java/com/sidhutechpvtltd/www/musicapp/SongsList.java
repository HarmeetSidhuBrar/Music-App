package com.sidhutechpvtltd.www.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);

        LinearLayout startNowPlaying = findViewById(R.id.now_playing_linear_layout);

        startNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startPlaying = new Intent(SongsList.this,NowPlaying.class);
                startActivity(startPlaying);
            }
        });


        ArrayList<Song> songs = new ArrayList<>();

        Song s = new Song("Baby", "Justin Beiber");
        songs.add(s);
        songs.add(new Song("Waka waka", "Shakira"));
        songs.add(new Song("Jai Ho", "A.R.Rehman"));
        songs.add(new Song("Faded", "Alen Walker"));
        songs.add(new Song("Girl's like you", "Maroon 5"));
        songs.add(new Song("Shape of You", "Ed Sheeren"));
        songs.add(new Song("Cheap Thrills","Sia"));
        songs.add(new Song("Beliver","Imagine Dragons"));
        songs.add(new Song("Despacito","Luis Fonsi"));

        SongAdapter adapter = new SongAdapter(this,songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
