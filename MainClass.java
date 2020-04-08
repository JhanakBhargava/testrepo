package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class MainClass {
    public static void main(String[] args){
        //ApplicationContext applicationContext= SpringApplication.run(MainClass.class,args);
        //BinarySearchImpl binarySearch= (BinarySearchImpl)applicationContext.getBean("BinarySearchImpl");
        //int result= binarySearch.binarySearch(new int[] {12,4,6},3);
        //.out.println(result);
        //ConfigurableApplicationContext applicationContext = SpringApplication.run(MainClass.class, args);
        //QuickSortAlgorithm ms = (QuickSortAlgorithm) applicationContext.getBean("quickSortAlgorithm");
        //int result= binarySearch.binarySearch(new int[] {12,4,6},3);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MainClass.class, args);
        BinarySearchImpl ms = (BinarySearchImpl) applicationContext.getBean("binarySearchImpl");



    }
}
