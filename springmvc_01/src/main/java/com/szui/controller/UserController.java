package com.szui.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:szui
 * @Date:2023/9/13 14:59
 * @Description:
 */

@RestController
@RequestMapping("/books")
public class UserController {

    @PostMapping
    public String save(){
        System.out.println("user save().....");
        return "{model:springmvc}";
    }
}
