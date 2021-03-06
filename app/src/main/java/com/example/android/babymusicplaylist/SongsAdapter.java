package com.example.android.babymusicplaylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }
}


