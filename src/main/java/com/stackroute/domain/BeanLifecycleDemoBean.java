package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void custominit(){
        System.out.println("MyService init method called");
    }
    @PreDestroy
    public void customdestroy(){
        System.out.println("MyService destroy method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy....");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properities set ");

    }

    }
