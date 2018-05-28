package com.example.android.babymusicplaylist;

/**
 * {@link Songs} represents a song that the user wants to hear.
 * It consists of the name of the song and the artist of the song.
 */

public class Songs {

    /**
     * The name of the song
     */
    private String SongName;

    /**
     * The name of the artist
     */
    private String ArtistName;

    public Songs(String songName, String artistName) {
        SongName = songName;
        ArtistName = artistName;
    }

    /**
     * Get the name of the song.
     */

    public String getSongName() {
        return SongName;
    }

    /**
     * Get the name of the artist.
     */

    public String getArtistName() {
        return ArtistName;
    }

}