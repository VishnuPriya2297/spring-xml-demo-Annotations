package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    String name;

    @Autowired
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("it is destroyed");
    }

    @PostConstruct
    public void customInit()
    {
        System.out.println("this is init method");
    }
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("this is destroy method");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");

    }

    }
