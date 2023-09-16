package com.szui.service;

import com.szui.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @Author:szui
 * @Date:2023/9/16 17:14
 * @Description:
 */
@Service
public class UserService implements UserDao {
    @Override
    public void cuntTime() {

    }

    @Override
    public void save() {
        System.out.println("User save()...");
    }
}
