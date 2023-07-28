package com.zzu.obrainbook.service.impl;


import com.zzu.obrainbook.dao.BookMapper;
import com.zzu.obrainbook.entity.Book;
import com.zzu.obrainbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: obrain-study
 * @description:
 * @author: XingJingYe
 * @create: 2023-07-12 17:25
 **/
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getBooks() {
        return bookMapper.selectList(null);
    }
}
