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
}
