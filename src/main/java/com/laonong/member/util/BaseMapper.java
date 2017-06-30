package com.laonong.member.util;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * Created by wb-scg178938 on 2017/6/30.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>  {
}
