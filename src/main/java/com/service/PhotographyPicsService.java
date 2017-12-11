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

    /**
     * 编辑图片
     * @param album_id
     * @param PhotographyPics_url
     * @Param PhotographyPics_id
     * @return
     */
    public int updatePhotoUrl(int album_id,String PhotographyPics_url,int PhotographyPics_id);

    /**
     * 删除指定相册ID 和图片ID的图片(修改状态码)
     * @param album_id
     * @param PhotographyPics_id
     * @return
     */
    public int deletePhoto(int album_id,int PhotographyPics_id);
}
