package com.zzu.obrainbook.controller;

import com.zzu.obrainbampub.util.HelloUtil;
import com.zzu.obrainbook.entity.Book;
import com.zzu.obrainbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: obrain-study
 * @description:
 * @author: XingJingYe
 * @create: 2023-07-12 17:26
 **/
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return HelloUtil.hello(name);
    }
}
