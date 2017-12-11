package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * Create by 文童 2017/12/9
 * 相册控制器
 */
@Controller
@RequestMapping("/album")
public class AlbumController {

    @Resource
    AlbumService albumService;

    /**
     * 创建一个相册
     * @param photographer_id           摄影师ID
     * @param albumName                 相册名称
     * @param alnumAddress              相册地址
     * @return
     */
    @RequestMapping(value = "/createAlbum",method = {RequestMethod.POST})
    @ResponseBody
    public int createAlbum(@RequestParam("photographer_id") String photographer_id,
                           @RequestParam("albumName") String albumName,
                           @RequestParam("alnumAddress") String alnumAddress) {
        return albumService.createAlbum(Integer.valueOf(photographer_id),albumName,alnumAddress);
    }

    /**
     * 通过相册Id获取相册里面的图片的Id 和URL
     * @param AlbumId
     * @return
     */
    @RequestMapping(value = "/getPhotoIdAndUrlByAlbumId",method = {RequestMethod.POST})
    @ResponseBody
    public List<Map<String, Object>> getPhotoIdAndUrlByAlbumId(int AlbumId) {
        return albumService.getPhotoIdAndUrlByAlbumId(AlbumId);
    }

    /**
     * 根据摄影师ID返回所有的相册信息
     * @return
     */
    @RequestMapping("getAllAlbumID")
    @ResponseBody
    public List<Map<String,Object>> getAllAlbumInfro(@RequestParam("photographer_id")String photographer_id){
        return albumService.getAllAlbumInfro(Integer.valueOf(photographer_id));
    }

    /**
     * 根据摄影师ID返回所有该摄影师的相册和相册图片
     * @param photographer_id
     * @return
     */
    @RequestMapping("getAlbumAndPhoto")
    @ResponseBody
    public String getAlbumAndPhoto(@RequestParam("photographer_id")String photographer_id){
        List<JSONObject> result = new ArrayList<>();
        int photographerId = 0;
        try {
            photographerId = Integer.valueOf(photographer_id);
        }
        catch (Exception e){
        }
        //检查传来的ID是否存在
        if (photographerId > 0){
            List<Map<String,Object>>albumInforo = albumService.getAllAlbumInfro(photographerId);
            //检查是否有相册
            if (albumInforo != null){
                for (int i = 0;i < albumInforo.size();i++) {
                    Map<String,Object> map = albumInforo.get(i);
                    int id = (int) map.get("album_id");
                    Date album_pushTime= (Date) map.get("album_pushTime");
                    System.out.println(album_pushTime);
                    List<Map<String, Object>> photoIdAndUrlByAlbumId = albumService.getPhotoIdAndUrlByAlbumId(id);
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("album_id",id);
                    jsonObject.put("album_pushTime",album_pushTime);
                    jsonObject.put("album_photos",photoIdAndUrlByAlbumId);
                    result.add(jsonObject);
                }
            }else {
            }
        }
        return "{\"allAblums\":"+result+"}";
    }
}
