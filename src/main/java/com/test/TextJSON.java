package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TextJSON {
    @Test
    public void textJson(){
        JSONObject object = new JSONObject();
        object.put("album_id",1);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        object.put("album_id",1);
        object.put("album_url",list);
        object.put("album_state",1);
        System.out.println(object.toString());
    }
}
