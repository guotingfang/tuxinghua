package com.springboot.jxsc.controller;

import com.springboot.jxsc.entity.Factory;
import com.springboot.jxsc.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HellorController {
    @Autowired
    FactoryService factoryService;

    @RequestMapping("/hello")
    public String helloController(Factory factory, Model model){
        List<Factory> factories = factoryService.getFactoryList();
        model.addAttribute("factorys", factories);
        return "login";
    }
}
