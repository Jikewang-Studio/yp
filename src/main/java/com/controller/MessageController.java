package com.controller;

import com.bean.P_to_u_message;
import com.service.MessageService;
import com.service.PhotographerService;
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
     *
     * @param userId
     * @param messageContent
     * @param photographerId
     */
    public void addMessages(Integer userId, String messageContent, Integer photographerId) {

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
