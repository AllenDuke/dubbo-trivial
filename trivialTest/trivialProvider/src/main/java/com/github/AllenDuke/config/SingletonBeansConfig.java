package com.github.AllenDuke.config;


import com.github.AllenDuke.spring.TrivialSpringUtil;
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

    //使得trivial可以从当前ioc容器中获取到bean，在当前接受rpc，进行方法反射调用时用到
    @Bean
    public TrivialSpringUtil trivialSpringUtil(){
        return new TrivialSpringUtil();
    }
}
