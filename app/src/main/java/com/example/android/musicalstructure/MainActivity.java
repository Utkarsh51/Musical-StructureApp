package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that shows All songs activity
        TextView allSongs = findViewById(R.id.category_all_songs);
        //adding a click listener on the view
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allSongsIntent = new Intent(MainActivity.this, All_Songs.class);
                startActivity(allSongsIntent);
            }
        });

        //find view that shows Recently Played activity
        TextView recentlyPlayed = findViewById(R.id.category_recently_played);
        //adding a click listener on the view
        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recentlyPlayedIntent = new Intent(MainActivity.this, RecentlyPlayed.class);
                startActivity(recentlyPlayedIntent);
            }
        });
        //find view that shows Playlist Activity
        TextView playlist = findViewById(R.id.category_playlist);
        //adding click listener to the view
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        //find view that shows artist Activity
        TextView artist = findViewById(R.id.category_artists);
        //adding click listener to the view
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistIntent);
            }
        });
        //find view that shows now PLaying Activity
        TextView nowPlaying = findViewById(R.id.category_now_playing);
        //adding click listener to the view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        //find view that shows purchase Songs Activity
        TextView purchaseSongs = findViewById(R.id.category_purchase_songs);
        //adding click listener to the view
        purchaseSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchaseSongsIntent = new Intent(MainActivity.this, PurchaseSongs.class);
                startActivity(purchaseSongsIntent);
            }
        });

    }
}
