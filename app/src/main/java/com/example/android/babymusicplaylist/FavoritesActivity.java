package com.example.android.babymusicplaylist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of songs

        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs(getString(R.string.fav1a), getString(R.string.fav1b)));
        songs.add(new Songs(getString(R.string.fav2a), getString(R.string.fav2b)));
        songs.add(new Songs(getString(R.string.fav3a), getString(R.string.fav3b)));

        SongsAdapter adapter = new SongsAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}