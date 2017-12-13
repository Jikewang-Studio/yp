package com.controller;

import com.bean.P_to_u_message;
import com.bean.U_to_p_message;
import com.service.MessageService;
import com.service.PhotographerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    /**
     * 1.用户根据自身Id，留言信息给摄影师。
     *@param u_to_p_message
     */
    public void addMessage(U_to_p_message u_to_p_message) {
    messageService.addMessage(u_to_p_message);
    }

    /**
     * 2.用户根据自身Id，获取到摄影师回复的信息。
     *
     * @param userId
     */
    public String getPMessages(Integer userId) {
        List<P_to_u_message> messages = messageService.getPMessages(Long.valueOf(userId));
        return "PMessages-list";
    }
}
