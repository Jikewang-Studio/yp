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

@Controller
@RequestMapping("/PhotographyPics")
public class PhotoUploadController {

    @Resource
    PhotographyPicsService photographyPicsService;

    /***
     * 保存文件
     * @param file
     * @return
     */
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

    @RequestMapping("filesUpload")
    @ResponseBody
    public String filesUpload(@RequestParam("file") MultipartFile[] files,HttpServletRequest request) {
        int album_id = Integer.valueOf(request.getParameter("album_id"));
        //判断file数组不能为空并且长度大于0
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                //保存文件
                saveFile(file,album_id);
            }
            return "1";
        }
        // 重定向
        return "0";
    }
}
