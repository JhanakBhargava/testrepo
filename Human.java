package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    @Autowired
    private Heart heart ;

//    @Autowired
//    public void set(Heart heart) {
//        this.heart = heart;
//    }

    public void startPumping()
    {
        if(heart!=null)
            heart.pump();
        else
            System.out.println("you are dead");
    }
}
