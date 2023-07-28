package com.zzu.obrainbook.entity;

import lombok.Data;

/**
 * @program: obrain-study
 * @description:
 * @author: XingJingYe
 * @create: 2023-07-12 17:17
 **/
@Data
public class Book {

    Integer id;
    String name;
    String author;
    String publish;
    Integer pages;
    Double price;
    Integer bookcaseid;
    Integer abled;
}
