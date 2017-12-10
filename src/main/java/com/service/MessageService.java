package com.service;

import com.bean.P_to_u_message;
import com.bean.U_to_p_message;

import java.util.List;

/**
 * Created by Administrator on 2017/12/3.
 */
public interface MessageService {
    /**
     *1.摄影师根据自己的ID，获取到用户给自己的留言
     * @param photographerId
     */
    public List<U_to_p_message> getUMessages(Integer photographerId);

    /**
     *2.1用户给摄影师留言。
     *
     */
    public void addMessage(U_to_p_message message);
    /**
     * 2.2用户根据自己的ID，获取到摄影师给自己的回复
     * @param
     */
    public List<P_to_u_message> getPMessages(Integer userId);
}
