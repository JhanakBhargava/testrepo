package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Body {
    public static void main(String args[])
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Human human=context.getBean("human",Human.class);
        human.startPumping();

    }
}
