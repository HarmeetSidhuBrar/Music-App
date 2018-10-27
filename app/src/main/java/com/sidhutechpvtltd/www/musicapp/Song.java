package com.sidhutechpvtltd.www.musicapp;

public class Song {
    private String aSongName;
    private String aArtistName;

    public Song(String songName,String artistName){
        aSongName = songName ;
        aArtistName = artistName ;

    }

    public String getSongName(){return aSongName;}
    public String getArtistName(){return aArtistName;}
}
