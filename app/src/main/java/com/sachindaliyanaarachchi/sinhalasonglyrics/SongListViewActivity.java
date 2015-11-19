package com.sachindaliyanaarachchi.sinhalasonglyrics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


import java.util.HashMap;
import java.util.Iterator;

public class SongListViewActivity extends AppCompatActivity {
    String songList = "";
    HashMap<String,String> allSongs = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SongList setup = new SongList();
        setup.MM(allSongs);
        setup.CW(allSongs);
        setup.RG(allSongs);
        setup.HRJ(allSongs);
        setup.GK(allSongs);
        setup.VR(allSongs);
        setup.PS(allSongs);
        setup.CTF(allSongs);
        setup.Baila(allSongs);
        setup.GY(allSongs);
        setup.Other(allSongs);

        TextView songName = (TextView) findViewById(R.id.song_name);
        Iterator i = allSongs.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            String value = allSongs.get(key);
            songList = songList + value + " \n";
        }
    }

}
