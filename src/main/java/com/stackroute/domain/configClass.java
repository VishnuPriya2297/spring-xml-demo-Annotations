package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configClass {
    @Bean
    public BeanLifecycleDemoBean getBean()
    {
        BeanLifecycleDemoBean beanLifeCycleDemoBean = new BeanLifecycleDemoBean();
        beanLifeCycleDemoBean.setName("vishnu priya");
        return beanLifeCycleDemoBean;
    }
    @Bean
    public BeanPostProcessorDemoBean getbeanpostprocessordemobean()
    {
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = new BeanPostProcessorDemoBean();
        return  beanPostProcessorDemoBean;

    }





}
