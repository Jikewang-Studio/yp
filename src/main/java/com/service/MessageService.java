package com.service;

import com.bean.U_to_p_message;
import com.dao.U_to_p_messageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
@Service
public class MessageService {
    @Autowired
    U_to_p_messageMapper u_to_p_messageMapper;
    //1.查询对应Id的摄影师的留言信息
    public List<U_to_p_message> getUMessages(Long photographerId){

        return  u_to_p_messageMapper.selectByPhotographerId(photographerId);
    }

}
