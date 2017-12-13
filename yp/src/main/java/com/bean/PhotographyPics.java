package com.bean;

import java.util.Date;

/**
 * Create by 文童 207-12-2
 * 图片类
 */
public class PhotographyPics {

    //图片ID
    private int PhotographyPics_id;

    //所属相册ID
    private int album_id;

    //图片上传时间
    Date PhotographyPics_pushTime;

    //图片状态
    int PhotographyPics_state;

    /**
     * get和set方法
     */
    public int getPhotographyPics_id() {
        return PhotographyPics_id;
    }

    public void setPhotographyPics_id(int photographyPics_id) {
        PhotographyPics_id = photographyPics_id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public Date getPhotographyPics_pushTime() {
        return PhotographyPics_pushTime;
    }

    public void setPhotographyPics_pushTime(Date photographyPics_pushTime) {
        PhotographyPics_pushTime = photographyPics_pushTime;
    }

    public int getPhotographyPics_state() {
        return PhotographyPics_state;
    }

    public void setPhotographyPics_state(int photographyPics_state) {
        PhotographyPics_state = photographyPics_state;
    }
}
