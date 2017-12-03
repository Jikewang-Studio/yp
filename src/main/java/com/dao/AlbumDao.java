package com.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Create by 文童 2017-12-2
 * 相册数据库操作
 *
 */
public interface AlbumDao {

    /**
     * 创建一个相册
     * @param photographer_id           摄影师ID
     * @param albumName                 相册名称
     * @param alnumAddress              相册地址
     * @return
     */
    public int createAlbum(@Param("photographer_id") int photographer_id,@Param("albumName") String albumName,@Param("alnumAddress") String alnumAddress);

    /**
     * 更新相册简介
     * @param intro
     * @return
     */
    public int updateAlbumIntro(String intro);
}
