package com.zzu.obrainbook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzu.obrainbook.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
