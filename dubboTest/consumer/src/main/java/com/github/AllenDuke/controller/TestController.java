package com.github.AllenDuke.controller;


import com.github.AllenDuke.service.Calculator;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference()
    private Calculator calculator;

    @RequestMapping("/add")
    public long add(){
        long start = System.currentTimeMillis();
        calculator.add(1,2);
        return System.currentTimeMillis()-start;
    }

}
