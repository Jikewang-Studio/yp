package com.service.Impl;

import com.dao.AlbumDao;
import com.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Creat by 文童 2017-12-2
 * 相册服务类实现
 */
@Service("albumService")
public class AlbumServiceImpl implements AlbumService{

    @Resource
    AlbumDao albumDao;
    /**
     * 创建一个相册
     * @param photographer_id           摄影师ID
     * @param albumName                 相册名称
     * @param alnumAddress              相册地址
     * @return
     */
    @Override
    public int createAlbum(int photographer_id, String albumName, String alnumAddress) {
        return albumDao.createAlbum(photographer_id,albumName,alnumAddress);
    }
}
