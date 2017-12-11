package com.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Create by 文童 2017/12/10
 * 关于图片表的数据库操作方法
 */
public interface PhotographyPicsDao {

    /**
     * 图片上传
     * @param album_id
     * @param PhotographyPics_url
     * @return
     */
    public int fileUpload(@Param("album_id") int album_id,
                          @Param("PhotographyPics_url") String PhotographyPics_url);

    /**
     * 编辑图片
     * @param album_id
     * @param PhotographyPics_url
     * @Param PhotographyPics_id
     * @return
     */
    public int updatePhotoUrl(@Param("album_id") int album_id,
                              @Param("PhotographyPics_url") String PhotographyPics_url,
                              @Param("PhotographyPics_id") int PhotographyPics_id);

    /**
     * 删除指定相册ID 和图片ID的图片(修改状态码)
     * @param album_id
     * @param PhotographyPics_id
     * @return
     */
    public int deletePhoto(@Param("album_id") int album_id,
                           @Param("PhotographyPics_id")int PhotographyPics_id);
}
