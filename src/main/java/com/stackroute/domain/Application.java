package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClass.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean(BeanLifecycleDemoBean.class);
        System.out.println(beanLifecycleDemoBean.getName());

        context.close();
    }
}
