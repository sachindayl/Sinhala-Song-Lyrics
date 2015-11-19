package com.sachindaliyanaarachchi.sinhalasonglyrics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Sachinda on 9/7/2015.
 * MM - Milton Mallawaarachchi
 * CW - Clarence Wijewardena
 * RG - Rookantha Gunathilake
 * HRJ - HR Jothipala
 * GK - Gunadasa Kapuge
 * VR - Victor Rathnayake
 * PS - Priya Suriyasena
 * CTF - CT Fernando
 * Baila - Baila
 * GY - Gypsies
 * O - Other
 */
public class MainActivity extends AppCompatActivity {
    String song;
    HashMap<String,String> allSongs = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    }

    public void showSong(View view){
        SongRandomizer rn = new SongRandomizer();
        String key = rn.randomNumberGenerator();
        Log.v("Check Random Key: ", key);
        song = rn.SongRandomize(key,allSongs);
        Log.v("Check Random Song: ", song);
        TextView songName = (TextView) findViewById(R.id.song_name);
        songName.setText(song);
    }

    public void songList(View view){

    }
}
