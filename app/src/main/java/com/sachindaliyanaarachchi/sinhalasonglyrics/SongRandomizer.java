package com.sachindaliyanaarachchi.sinhalasonglyrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Sachinda on 9/7/2015.
 */
public class SongRandomizer {

    int min = 1;
    int max = 94;

    //gkey = given key
    //songMap = mapped set of songs
    public String SongRandomize(String gKey, HashMap<String, String> songMap) {
        String song = "";
        String key = "";
        String artist = "";
        for (Map.Entry<String, String> e : songMap.entrySet()) {
            if (e.getKey().startsWith(gKey)) {
                song = e.getValue();
                key = e.getKey();
                break;
            }
        }
        if(key.contains("MM")){
            artist = "Milton Mallawaarachchi";
        }else if(key.contains("CW")){
            artist = "Clarence Wijewardena";
        }else if(key.contains("RG")){
            artist = "Rookantha Gunathilake";
        }else if(key.contains("HRJ")){
            artist = "HR Jothipala";
        }else if(key.contains("GK")){
            artist = "Gunadasa Kapuge";
        }else if(key.contains("VR")){
            artist = "Victor Rathnayake";
        }else if(key.contains("PS")){
            artist = "Priya Suriyasena";
        }else if(key.contains("CTF")){
            artist = "CT Fernando";
        }else if(key.contains("B")){
            artist = "Baila";
        }else if(key.contains("GY")){
            artist = "Gypsies";
        }else{
            artist = "Other";
        }

        return artist + " - " + song;

    }

    public String randomNumberGenerator() {
        String setKey;
        Random random = new Random();
        int rn = random.nextInt(max - min + 1) + min;
        if (rn < 10) {
            setKey = "000" + rn;
        } else {
            setKey = "00" + rn;
        }
        return setKey;
    }
}
