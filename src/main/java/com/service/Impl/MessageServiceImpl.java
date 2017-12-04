package com.service.Impl;

import com.bean.P_to_u_message;
import com.bean.U_to_p_message;
import com.dao.P_to_u_messageMapper;
import com.dao.U_to_p_messageMapper;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
@Service("MessageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    U_to_p_messageMapper u_to_p_messageMapper;

    @Autowired
    P_to_u_messageMapper p_to_u_messageMapper;
    /**
     * 1.通过摄影师ID，获取到用户给摄影师的留言信息
     * @param photographerId
     */
    @Override
    public List<U_to_p_message> getUMessages(Long photographerId) {
        return u_to_p_messageMapper.selectByPhotographerId(photographerId);
    }
    /**
     * 2.用户根据Id，获取到摄影师回复给自己的信息。
     * @param userId
     */
    @Override
    public List<P_to_u_message> getPMessages(Long userId) {
        return p_to_u_messageMapper.selectByUserId(userId);
    }
}
