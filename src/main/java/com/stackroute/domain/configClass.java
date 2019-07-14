package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configClass {
    @Bean
    public Actor getActor()
    {
        Actor actor = new Actor();
        actor.setName("sharukh");
        actor.setAge(50);
        actor.setGender("male");
        return actor;
    }

    @Bean
    public Movie getMovie()
    {
        return new Movie();

    }

}
