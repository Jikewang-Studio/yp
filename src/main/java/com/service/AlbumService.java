package com.service;

import org.apache.ibatis.annotations.Param;

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

}
