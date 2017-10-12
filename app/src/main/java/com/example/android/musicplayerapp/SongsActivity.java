package com.example.android.musicplayerapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.android.musicplayerapp.databinding.ActivitySongsBinding;

public class SongsActivity extends AppCompatActivity {
   /* private ImageView homeIV;
    private ImageView artistIV;
    private ImageView paymentIV;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      ActivitySongsBinding b = DataBindingUtil.setContentView(this, R.layout.activity_songs);
    /*    setContentView(R.layout.activity_songs);
        homeIV = (ImageView) findViewById(R.id.home_icon);
        artistIV = (ImageView) findViewById(R.id.artist_icon);
        paymentIV = (ImageView) findViewById(R.id.payment_icon);
        */getSupportActionBar().setTitle("Songs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b.homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeIV = new Intent(SongsActivity.this, MainActivity.class);

                startActivity(homeIV);

            }
        });
        b.artistIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent artistIV = new Intent(SongsActivity.this, ArtistsActivity.class);

                startActivity(artistIV);

            }
        });
        b.paymentIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paymentIV = new Intent(SongsActivity.this, PaymentActivity.class);

                startActivity(paymentIV);

            }
        });


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
