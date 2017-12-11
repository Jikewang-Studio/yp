package com.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Create by 文童 2017-12-2
 * 相册数据库操作
 *
 */
@Repository
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
//    public int updateAlbumIntro(String intro);

    /**
     * 通过相册Id获取相册里面的图片的Id 和URL
     * @param AlbumId
     * @return
     */
    public List<Map<String, Object>> getPhotoIdAndUrlByAlbumId(@Param("AlbumId") int AlbumId);

    /**
     * 根据摄影师ID返回所有的相册信息
     * @return
     */
    public List<Map<String,Object>> getAllAlbumInfro(@Param("photographer_id")int photographer_id);
}
