package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(configClass.class);
        Movie movie =context.getBean( Movie.class);
        movie.display();
    }
}
