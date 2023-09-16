package com.szui;

import com.szui.config.SpringConfig;
import com.szui.dao.BookDao;
import com.szui.dao.UserDao;
import com.szui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:szui
 * @Date:2023/9/16 16:45
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao)context.getBean(BookDao.class);
        UserDao userDao = (UserDao)context.getBean(UserDao.class);


        //bookDao.save();
        bookDao.update("shiyan",18);
        //userDao.save();

    }
}
