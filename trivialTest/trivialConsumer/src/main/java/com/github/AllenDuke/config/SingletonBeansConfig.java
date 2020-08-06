package com.github.AllenDuke.config;


import com.github.AllenDuke.clientService.RPCClient;
import com.github.AllenDuke.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杜科
 * @description 一些单例
 * @contact AllenDuke@163.com
 * @date 2020/4/24
 */
@Configuration
public class SingletonBeansConfig {

    @Bean
    public Calculator calculator(){
        return (Calculator) RPCClient.getServiceImpl(Calculator.class);
    }
}
