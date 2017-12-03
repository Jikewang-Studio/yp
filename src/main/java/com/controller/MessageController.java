package com.controller;

import com.bean.P_to_u_message;
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

//1.摄影师获取，用户留言【Test测试成功】
 public  String getUerMessages(Long photographerId, Model model){
     List<U_to_p_message> u_to_p_messages=messageService.getUMessages(photographerId);
     model.addAttribute("u_to_p_messages",u_to_p_messages);
     return "u-p-messages";
 }
//2.用户获取摄影师回复【Test测试成功】
 public String getPhotographerMessages(Long userId,Model model){
     List<P_to_u_message> p_to_u_messages=messageService.getPMessages(userId);
     model.addAttribute("p_to_u_messages",p_to_u_messages);
     return "p-u-messages";
 }
}
