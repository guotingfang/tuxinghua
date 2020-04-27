package com.springboot.jxsc.dao;

import com.springboot.jxsc.entity.Factory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FactoryMapper {

    //查询所有
    List<Factory> selectAll();
    //查询所有生产厂家
    List<Factory> findAll(Factory factory);
    //插入数据
    int insertFactory (Factory factory);


}
