package com.szui.service;

import com.szui.dao.BookDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author:szui
 * @Date:2023/9/16 16:39
 * @Description:
 */
@Repository
public class BookService implements BookDao {
    public void save(){
        System.out.println("save()...");
    }

    public String update(String name,Integer age){
        //System.out.println(name);
        int I = 1/0;
        return name;
    }


}
