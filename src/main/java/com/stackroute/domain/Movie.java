package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movie {


    public List<Actor> getActor() {
        return actor;
    }

    List<Actor> actor;

    @Autowired
    public Movie(List<Actor> actor) {
        this.actor = actor;
    }


    //to call the to string method and display the information

    public void display()
    {
        System.out.println(actor.toString());
    }

}
