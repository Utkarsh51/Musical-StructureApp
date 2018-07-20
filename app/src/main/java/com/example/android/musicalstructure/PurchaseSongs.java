package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PurchaseSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_songs);
        //find the button that redirects to home activity
        Button home = findViewById(R.id.button_home);
        //adding listener to the button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(PurchaseSongs.this,MainActivity.class);
                startActivity(homeIntent);
            }
        });
        //find the button that redirects to now playing activity
        Button nowPlaying = findViewById(R.id.button_now_playing);
        //adding listener to the button
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(PurchaseSongs.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        //find the button that redirects to all songs activity
        Button allSongs = findViewById(R.id.button_all_songs);
        //adding listener to the button
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allSongsIntent = new Intent(PurchaseSongs.this,All_Songs.class);
                startActivity(allSongsIntent);
            }
        });
    }
}
