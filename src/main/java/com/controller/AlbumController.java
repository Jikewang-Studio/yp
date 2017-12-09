package com.controller;

import com.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by 文童 2017/12/9
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
}
