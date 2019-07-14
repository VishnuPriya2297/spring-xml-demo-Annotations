package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class configClass {
    @Bean
    public Actor getActor()
    {
        Actor actor = new Actor("Hrithik","Male" ,45);
       return actor;
    }


   @Bean
    public Movie getMovie()
    {
        return new Movie((getActor()));

    }

}
