package com.github.AllenDuke.serviceImpl;

import com.github.AllenDuke.service.Calculator;

/**
 * @author 杜科
 * @description 计算器服务实现
 * @contact AllenDuke@163.com
 * @since 2020/2/11
 */
public class CalculatorImpl implements Calculator {

    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public int multipy(Integer a, Integer b) {
        return a*b;
    }
}
