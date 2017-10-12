package com.example.android.musicplayerapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.android.musicplayerapp.databinding.ActivityArtistsBinding;

public class ArtistsActivity extends AppCompatActivity {

  /*  private ImageView homeIV;
    private ImageView songsIV;
    private ImageView paymentIV;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_artists);
        homeIV = (ImageView) findViewById(R.id.home_icon);
        songsIV = (ImageView) findViewById(R.id.songs_icon);
        paymentIV = (ImageView) findViewById(R.id.payment_icon);
       */ getSupportActionBar().setTitle("Artists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActivityArtistsBinding b = DataBindingUtil.setContentView(this, R.layout.activity_artists);

        b.homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeIV = new Intent(ArtistsActivity.this, MainActivity.class);

                startActivity(homeIV);

            }
        });
        b.songsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent songsIV = new Intent(ArtistsActivity.this, SongsActivity.class);

                startActivity(songsIV);

            }
        });
        b.paymentIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paymentIV = new Intent(ArtistsActivity.this, PaymentActivity.class);

                startActivity(paymentIV);

            }
        });


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


