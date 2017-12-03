package com.controller;

import com.bean.U_to_p_message;
import com.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

//import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
public class MessageController {
    @Autowired
    MessageService messageService;
//摄影师获取，用户留言
 public  String getUerMessages(Long photographerId, Model model){
     List<U_to_p_message> messages=messageService.getUMessages(photographerId);
     model.addAttribute("messages",messages);
     return "u-p-messages";
 }
}
