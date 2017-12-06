package com.service;

import com.bean.Custom_made;

/**
 * Created by Administrator on 2017/12/3.
 */
public interface CustomService {
    /**
     * 1.用户定制添加。
     * @param custom_made 【只需要用到该对象的】
     */
    public void insertCustom(Custom_made custom_made);
}
