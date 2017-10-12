package com.example.android.musicplayerapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicplayerapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    /*  private ImageView songsIV;
      private ImageView artistIV;
      private ImageView paymentIV;
      private ImageView playIV;
      private boolean isPlaying = false;
  */
    ActivityMainBinding b;
    boolean isPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //setContentView(R.layout.activity_main);
      /*
        songsIV = (ImageView) findViewById(R.id.songs_icon);
        artistIV = (ImageView) findViewById(R.id.artist_icon);
        paymentIV = (ImageView) findViewById(R.id.payment_icon);
        playIV = (ImageView) findViewById(R.id.play_pause_icon);
        */
        b.songsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent songsIV = new Intent(MainActivity.this, SongsActivity.class);

                startActivity(songsIV);

            }
        });
        b.artistIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent artistIV = new Intent(MainActivity.this, ArtistsActivity.class);

                startActivity(artistIV);

            }
        });
        b.paymentIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paymentIV = new Intent(MainActivity.this, PaymentActivity.class);

                startActivity(paymentIV);

            }
        });
        b.playPauseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    isPlaying = false;
                    b.playPauseIcon.setImageResource(R.drawable.ic_play_arrow_black_24dp);

                } else {
                    isPlaying = true;
                    b.playPauseIcon.setImageResource(R.drawable.ic_pause_black_24dp);

                }

            }
        });
    }
}

