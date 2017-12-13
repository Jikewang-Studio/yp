package com.service.Impl;


import com.dao.PhotographyPicsDao;
import com.service.PhotographyPicsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Create by 文童 2017/12/10
 * 图片服务层实现
 */
@Service("photographyPicsService")
public class PhotographyPicsServiceImpl implements PhotographyPicsService {
    @Resource
    PhotographyPicsDao photographyPicsDao;

    /**
     * 图片上传
     * @param album_id
     * @param PhotographyPics_url
     * @return
     */
    @Override
    public int fileUpload(int album_id, String PhotographyPics_url) {
        return photographyPicsDao.fileUpload(album_id,PhotographyPics_url);
    }

    /**
     * 编辑图片
     * @param album_id
     * @param PhotographyPics_url
     * @param PhotographyPics_id
     * @return
     */
    @Override
    public int updatePhotoUrl(int album_id, String PhotographyPics_url, int PhotographyPics_id) {
        return photographyPicsDao.updatePhotoUrl(album_id,PhotographyPics_url,PhotographyPics_id);
    }

    /**
     * 删除指定相册ID 和图片ID的图片(修改状态码)
     * @param album_id
     * @param PhotographyPics_id
     * @return
     */
    @Override
    public int deletePhoto(int album_id, int PhotographyPics_id) {
        return photographyPicsDao.deletePhoto(album_id,PhotographyPics_id);
    }
}
