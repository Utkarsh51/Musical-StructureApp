package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecentlyPlayed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);
        //find the button that redirects to home activity
        Button home = findViewById(R.id.button_home);
        //adding listener to the button
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(RecentlyPlayed.this,MainActivity.class);
                startActivity(homeIntent);
            }
        });
        //find the button that redirects to now playing activity
        Button nowPlaying = findViewById(R.id.button_now_playing);
        //adding listener to the button
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(RecentlyPlayed.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        //find the button that redirects to purchase Songs activity
        Button purchaseSongs = findViewById(R.id.button_purchase_songs);
        //adding listener to the button
        purchaseSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent purchaseSongsIntent = new Intent(RecentlyPlayed.this,PurchaseSongs.class);
                startActivity(purchaseSongsIntent);
            }
        });
    }
}
