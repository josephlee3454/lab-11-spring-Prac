package com.Songr2.Songr2;

public class Album {
    String title;
    String artist;
    int songCount;
    String songLength;
    String imgUrl;

    public Album(String title, String artist, int songCount, String songLength, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.songLength = songLength;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public String getSongLength() {
        return songLength;
    }

    public void setSongLength(String songLength) {
        this.songLength = songLength;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }



}

