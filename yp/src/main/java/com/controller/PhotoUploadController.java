package com.controller;

import com.service.PhotographyPicsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * Create by 文童 2017/12/10
 * 图片控制器
 */
@Controller
@RequestMapping("/PhotographyPics")
public class PhotoUploadController {

    //图片保存到本地路径
    private static final String PHOTO_SAVE_URL = "D:/Text/yp/src/main/webapp/springUpload/";
    //图片保存到数据库路径
    private static final String PHOTO_SAVE_IN_MYSQL_URL = "http://localhost:8080/springUpload/";

    @Resource
    PhotographyPicsService photographyPicsService;
/*

    */
/***
     * 保存文件
     * @param file
     * @return
     *//*

    private boolean saveFile(MultipartFile file,int album_id) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = "D:/Text/yp/src/main/webapp/springUpload/" + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
                //表中路径
                String PhotographyPics_url = "http://localhost:8080/springUpload/"+file.getOriginalFilename();
                photographyPicsService.fileUpload(album_id,PhotographyPics_url);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
*/

    /**
     * 上传图片
     * @param files
     * @param request
     * @return
     */
    @RequestMapping("filesUpload")
    @ResponseBody
    public String filesUpload(@RequestParam("file") MultipartFile[] files,HttpServletRequest request) throws IOException {
        int album_id = Integer.valueOf(request.getParameter("album_id"));
        //判断file数组不能为空并且长度大于0
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                //保存文件
                if (!file.isEmpty()){
                    // 文件保存路径
                    String filePath = PHOTO_SAVE_URL + file.getOriginalFilename();
                    // 转存文件
                    file.transferTo(new File(filePath));
                    //表中路径
                    String PhotographyPics_url = PHOTO_SAVE_IN_MYSQL_URL+file.getOriginalFilename();
                    photographyPicsService.fileUpload(album_id,PhotographyPics_url);
                }
            }
            return "1";
        }
        return "0";
    }

    /**
     * 编辑图片
     * @param file
     * @param request
     * @return
     */
    @RequestMapping("/updatePhotoUrl")
    @ResponseBody
    public String updatePhotoUrl(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IOException {
        int album_id = Integer.valueOf(request.getParameter("album_id"));
        int PhotographyPics_id = Integer.valueOf(request.getParameter("PhotographyPics_id"));
        if (album_id > 0 && PhotographyPics_id > 0){
            if (!file.isEmpty()){
                // 文件保存路径
                String filePath = PHOTO_SAVE_URL + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
                //表中路径
                String PhotographyPics_url = PHOTO_SAVE_IN_MYSQL_URL+file.getOriginalFilename();
                photographyPicsService.updatePhotoUrl(album_id,PhotographyPics_url,PhotographyPics_id);
                return "1";
            }
            else {
                return "文件为空";
            }
        }
        else {
            return "无指定ID";
        }
    }

    /**
     * 删除指定相册ID 和图片ID的图片(修改状态码)
     * @param album_id
     * @param PhotographyPics_id
     * @return
     */
    @RequestMapping("/deletePhoto")
    @ResponseBody
    public String deletePhoto(@RequestParam("album_id") String album_id,
                           @RequestParam("PhotographyPics_id") String PhotographyPics_id) {
        int albumId = Integer.valueOf(album_id);
        int photographyPicsId = Integer.valueOf(PhotographyPics_id);
        if (albumId > 0 && photographyPicsId > 0){
            try{
                photographyPicsService.deletePhoto(albumId,photographyPicsId);
                return "1";
            }catch (Exception e){
                return "删除异常，ID号有误或已经删除";
            }
        }else {
            return "传入的ID有误";
        }
    }
}
