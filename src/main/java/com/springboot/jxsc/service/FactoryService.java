package com.springboot.jxsc.service;

import com.springboot.jxsc.entity.Factory;

import java.util.List;

public interface FactoryService {

    //查询所有
    List<Factory> getFactoryList();

    //获取所有Factory
    List<Factory> getFactoryList(Factory factory);

}
