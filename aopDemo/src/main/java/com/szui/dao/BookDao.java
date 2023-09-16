package com.szui.dao;

/**
 * @Author:szui
 * @Date:2023/9/16 16:49
 * @Description:
 */
public interface BookDao {
    public void save();

    String update(String name,Integer age);
}
