package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MAYANK on 3/9/2017.
 */

public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInfo;

    public SongAdapter(Context context, ArrayList<Song> theSongs){
        songs = theSongs;
        songInfo = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LinearLayout songLayout = (LinearLayout)songInfo.inflate(R.layout.song,viewGroup,false);
        TextView songView = (TextView)songLayout.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLayout.findViewById(R.id.song_artist);
        Song currentSong = songs.get(position);
        songView.setText(currentSong.getArtist());
        songLayout.setTag(position);
        return songLayout;
    }
}
