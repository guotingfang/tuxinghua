package com.springboot.jxsc.service.impl;

import com.springboot.jxsc.entity.Factory;
import com.springboot.jxsc.dao.FactoryMapper;
import com.springboot.jxsc.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryServiceImpl implements FactoryService {

    @Autowired
    FactoryMapper factoryMapper;

    public List<Factory> getFactoryList(){
        return factoryMapper.selectAll();
    }

    public List<Factory> getFactoryList(Factory factory){

        return factoryMapper.findAll(factory);
    }

    public int addFactory(){
        return factoryMapper.
    }

}
