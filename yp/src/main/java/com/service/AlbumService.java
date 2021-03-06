package com.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Create by 文童 2017-12-2
 * 相册服务类
 */
public interface AlbumService {

    /**
     * 创建一个相册
     * @param photographer_id           摄影师ID
     * @param albumName                 相册名称
     * @param alnumAddress              相册地址
     * @return
     */
    public int createAlbum(int photographer_id,String albumName,String alnumAddress);

    /**
     * 通过相册Id获取相册里面的图片的Id 和URL
     * @param AlbumId
     * @return
     */
    public List<Map<String, Object>> getPhotoIdAndUrlByAlbumId(int AlbumId);

    /**
     * 返回所有的相册信息
     * @return
     */
    public List<Map<String,Object>> getAllAlbumInfro(int photographer_id);
}
