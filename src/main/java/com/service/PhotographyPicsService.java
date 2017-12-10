package com.service;

import org.apache.ibatis.annotations.Param;

/**
 * Create by 文童 2017/12/10
 * 图片服务层
 */
public interface PhotographyPicsService {
    /**
     * 图片上传
     * @param album_id
     * @param PhotographyPics_url
     * @return
     */
    public int fileUpload(int album_id,String PhotographyPics_url);
}
