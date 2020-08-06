package com.github.AllenDuke.controller;


import com.github.AllenDuke.clientService.RPCClient;
import com.github.AllenDuke.service.Calculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satsuki
 * @time 2019/8/27 15:58
 * @description:
 * 调用dubbo
 */
@RestController
public class TestController {

    @RequestMapping("/add")
    public long add(){
        System.out.println("in");
        long start = System.currentTimeMillis();
        Calculator calculator= (Calculator) RPCClient.getServiceImpl(Calculator.class);
        calculator.add(1,2);
//        GenericService genericService = RPCClient.getGenericService();
//        genericService.invokeAsy("Calculator","add",new Object[]{1,2});
        System.out.println("out");
        return System.currentTimeMillis()-start;
    }

}
