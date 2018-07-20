package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        //find the button that redirects to playlist activity
        Button playlist = findViewById(R.id.button_playlist);
        //adding listener to the button
       playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(NowPlaying.this,Playlist.class);
                startActivity(playlistIntent);
            }
        });
        //find the button that redirects to all songs activity activity
        Button allSongs = findViewById(R.id.button_all_songs);
        //adding listener to the button
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allSongsIntent = new Intent(NowPlaying.this,All_Songs.class);
                startActivity(allSongsIntent);
            }
        });
        //find the button that redirects to artist activity
        Button artist = findViewById(R.id.button_artist);
        //adding listener to the button
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(NowPlaying.this,Artist.class);
                startActivity(artistIntent);
            }
        });
    }
}
