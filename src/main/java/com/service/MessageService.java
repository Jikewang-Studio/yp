package com.service;

import com.bean.P_to_u_message;
import com.bean.U_to_p_message;
import com.dao.P_to_u_messageMapper;
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
    @Autowired
    P_to_u_messageMapper p_to_u_messageMapper;
    //1.摄影师得到用户给自己的留言信息【根据摄影师自己的ID查询】
    public List<U_to_p_message> getUMessages(Long photographerId){

        return  u_to_p_messageMapper.selectByPhotographerId(Long.valueOf(photographerId));
    }
   //2.用户得到摄影师给自己的回复信息【根据用户自己的ID查询】
   public List<P_to_u_message> getPMessages(Long userId){
        return p_to_u_messageMapper.selectByUserId(Long.valueOf(userId));
   }
}
