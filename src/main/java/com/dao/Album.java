package com.dao;

import java.util.Date;

/**
 * Create by 文童 2017-12-2
 * 相册类
 */
public class Album {
    //相册ID
    private int albumId;

    //所属摄影师Id
    private int photographer_id;

    //相册名称
    private String albumName;

    //相册地址
    private String albumAddress;

    //相册简介
    private String album_intro;

    //相册的推送时间
    private Date album_pushTime;

    //相册的状态

    private int album_state;

    /**
     *属性的get和set方法
     */
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getPhotographer_id() {
        return photographer_id;
    }

    public void setPhotographer_id(int photographer_id) {
        this.photographer_id = photographer_id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumAddress() {
        return albumAddress;
    }

    public void setAlbumAddress(String albumAddress) {
        this.albumAddress = albumAddress;
    }

    public String getAlbum_intro() {
        return album_intro;
    }

    public void setAlbum_intro(String album_intro) {
        this.album_intro = album_intro;
    }

    public Date getAlbum_pushTime() {
        return album_pushTime;
    }

    public void setAlbum_pushTime(Date album_pushTime) {
        this.album_pushTime = album_pushTime;
    }

    public int getAlbum_state() {
        return album_state;
    }

    public void setAlbum_state(int album_state) {
        this.album_state = album_state;
    }

}
