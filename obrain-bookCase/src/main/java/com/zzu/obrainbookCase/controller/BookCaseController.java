package com.zzu.obrainbookCase.controller;

import com.zzu.obrainbookCase.entity.BookCase;
import com.zzu.obrainbookCase.service.BookCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: obrain-study
 * @description:
 * @author: XingJingYe
 * @create: 2023-07-15 14:27
 **/
@RestController
@RequestMapping("/bookCase")
public class BookCaseController {

    @Autowired
    BookCaseService bookCaseService;

    @GetMapping("/all")
    List<BookCase> getAllBookCase() {
        return bookCaseService.getBookCases();
    }
}
