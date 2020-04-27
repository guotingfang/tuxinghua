package com.springboot.jxsc.controller;

import com.springboot.jxsc.entity.Factory;
import com.springboot.jxsc.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FactoryController {
    @Autowired
    FactoryService factoryService;

    @RequestMapping("/factory")
    public String list(Model model){
        List<Factory> factoryList = factoryService.getFactoryList();
        model.addAttribute("factroys" ,factoryList);
        return "basicinfo/factory/FactoryList";
    }

    @GetMapping("/hha")
    public String index(){
        Factory factory = new Factory("aaa","fff");
        factoryService.a
       return "/home/fmain";
    }



}
