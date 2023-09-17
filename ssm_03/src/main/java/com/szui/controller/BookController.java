package com.szui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:szui
 * @Date:2023/9/13 22:22
 * @Description:
 */
@Controller
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    public void save(){
        System.out.println("save()....");
    }
}
