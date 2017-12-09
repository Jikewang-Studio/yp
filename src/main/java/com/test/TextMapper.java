package com.test;

import com.dao.AlbumDao;
import com.dao.PhotographerDao;
import com.service.PhotographerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TextMapper {

    @Resource
    PhotographerDao photographerDao;

    @Resource
    AlbumDao albumDao;
    @Test
    public void textPhotographerDao(){
        System.out.println(photographerDao.getPhotographerDetailsById(1));
        System.out.println(photographerDao.photographerRegister(1,"wt","500243199810015352",'M'));
        System.out.println(photographerDao.updatePhotographerIntro(1,"我叫text02"));
    }

    @Test
    public void textAlbumDao(){
        System.out.println(albumDao.createAlbum(1,"text01","adress01"));
        System.out.println(albumDao.getPhotoIdAndUrlByAlbumId(1));
    }
}
