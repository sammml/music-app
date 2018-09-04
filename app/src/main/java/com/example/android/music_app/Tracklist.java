package com.example.android.music_app;

/**
 * *{@link Tracklist} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for the word.
 */

public class Tracklist {

    /**
     * Default Songs
     */
    private String mSongs;

    /**
     * Create a new Tracklist
     *
     * @param songs all the songs
     */
    public Tracklist(String songs) {
        mSongs = songs;
    }


    /**
     * Get the songs
     */
    public String getSongs() {
        return mSongs;
    }

}
