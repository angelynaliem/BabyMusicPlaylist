package com.example.android.babymusicplaylist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView favorites = findViewById(R.id.favorites);

        favorites.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);

                startActivity(favoritesIntent);
            }
        });

        TextView bedtimeMusic = findViewById(R.id.bedtime_music);

        bedtimeMusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent bedtimeMusicIntent = new Intent(MainActivity.this, BedtimeMusicActivity.class);

                startActivity(bedtimeMusicIntent);
            }
        });

    }
}
