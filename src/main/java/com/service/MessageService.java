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
    public List<U_to_p_message> getUMessages(Long photographerId);

    /**
     * 2.用户根据自己的ID，获取到摄影师给自己的回复
     * @param
     */
    public List<P_to_u_message> getPMessages(Long userId);
}
