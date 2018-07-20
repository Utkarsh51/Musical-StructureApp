package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        //find the button that redirects to playlist activity
        Button playlist = findViewById(R.id.button_playlist);
        //adding listener to the button
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(Artist.this,Playlist.class);
                startActivity(playlistIntent);
            }
        });
        //find the button that redirects to now playing activity
        Button nowPlaying = findViewById(R.id.button_now_playing);
        //adding listener to the button
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Artist.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        //find the button that redirects to purchase Songs activity
        Button purchaseSongs = findViewById(R.id.button_purchase_songs);
        //adding listener to the button
        purchaseSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchaseSongsIntent = new Intent(Artist.this,PurchaseSongs.class);
                startActivity(purchaseSongsIntent);
            }
        });
    }
}
