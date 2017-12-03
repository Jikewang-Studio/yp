package com.test;

import com.service.AlbumService;
import com.service.PhotographerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TextImpl {

    @Resource
    PhotographerService photographerService;

    @Resource
    AlbumService albumService;
    @Test
    public void textPhotographerService(){
        System.out.println(photographerService.getPhotographers(1));
        System.out.println(photographerService.photographerRegister(1,"wt","500243199810015352",'M'));
        System.out.println(photographerService.updatePhotographerIntro(2,"我是Text02"));
    }
    @Test
    public void textAlbum(){
        System.out.println(albumService.createAlbum(1,"text01","adress01"));
    }
}