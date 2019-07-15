package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application
{
    public static void main( String[] args ) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(configClass.class);
        BeanLifecycleDemoBean bean =context.getBean( BeanLifecycleDemoBean.class);
        //displaying the values of the actor
        System.out.println(bean.getName());

        context.close();
    }
}
