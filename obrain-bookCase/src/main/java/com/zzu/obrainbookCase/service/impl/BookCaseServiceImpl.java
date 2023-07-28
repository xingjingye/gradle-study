package com.zzu.obrainbookCase.service.impl;

import com.zzu.obrainbookCase.dao.BookCaseMapper;
import com.zzu.obrainbookCase.entity.BookCase;
import com.zzu.obrainbookCase.service.BookCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: obrain-study
 * @description:
 * @author: XingJingYe
 * @create: 2023-07-15 14:26
 **/
@Service
public class BookCaseServiceImpl implements BookCaseService {

    @Autowired
    BookCaseMapper bookCaseMapper;

    @Override
    public List<BookCase> getBookCases() {
        return bookCaseMapper.selectList(null);
    }
}
