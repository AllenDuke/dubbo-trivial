package com.github.AllenDuke.controller;


import com.github.AllenDuke.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    Calculator calculator;

    @RequestMapping("/add")
    public long add(){
        long start = System.currentTimeMillis();
        calculator.add(1,2);
//        GenericService genericService = RPCClient.getGenericService();
//        genericService.invokeAsy("Calculator","add",new Object[]{1,2});
        return System.currentTimeMillis()-start;
    }

}
