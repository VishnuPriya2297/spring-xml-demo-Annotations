package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    /*public Actor getActor() {
        return actor;
    }*/

    Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //to call the to string method and display the information
    public void display()
    {
        System.out.println(actor.toString());
    }

}
