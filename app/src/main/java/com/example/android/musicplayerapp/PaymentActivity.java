package com.example.android.musicplayerapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.android.musicplayerapp.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {
  /* private ImageView homeIV;
   private ImageView songsIV;
   private ImageView artistIV;
   */ @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      ActivityPaymentBinding b = DataBindingUtil.setContentView(this,R.layout.activity_payment);
        /*setContentView(R.layout.activity_payment);
        homeIV = (ImageView) findViewById(R.id.home_icon);
        songsIV = (ImageView) findViewById(R.id.songs_icon);
        artistIV = (ImageView) findViewById(R.id.artist_icon);
        */
        getSupportActionBar().setTitle("Payment");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


  b.homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeIV = new Intent(PaymentActivity.this, MainActivity.class);

                startActivity(homeIV);

            }
        });
        b.songsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent songsIV = new Intent(PaymentActivity.this, SongsActivity.class);

                startActivity(songsIV);

            }
        });
        b.artistIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent artistIV = new Intent(PaymentActivity.this, ArtistsActivity.class);

                startActivity(artistIV);

            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}

