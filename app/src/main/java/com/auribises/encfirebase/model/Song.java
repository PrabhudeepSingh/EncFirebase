package com.auribises.encfirebase.model;

/**
 * Created by ishantkumar on 22/03/18.
 */

public class Song {

    public String title;
    public String artist;
    public int length;

    public Song(){

    }

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
}
