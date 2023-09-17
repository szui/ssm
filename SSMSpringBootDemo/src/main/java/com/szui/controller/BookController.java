package com.szui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:szui
 * @Date:2023/9/14 15:07
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/getById")
    public String getById(){
        System.out.println("getById");
        return "ok";
    }
}
