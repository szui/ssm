package com.szui.dao;

import com.szui.domain.Book;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @Author:szui
 * @Date:2023/9/13 22:18
 * @Description:
 */
public interface BookDao {
    @Insert("")
    public void save(Book book);
    public void update(Book book);
    public void delete (Integer id);
    public Book getById(Integer id);
    public List<Book> getAll();
}
