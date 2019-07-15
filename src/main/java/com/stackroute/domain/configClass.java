package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class configClass {
    @Bean
    public BeanLifecycleDemoBean BeanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beandemo=new BeanLifecycleDemoBean();
        beandemo.setName("Vishnu Priya");
        return beandemo;
    }




}
