package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//import org.aspectj.lang.annotation.Aspect;
//@Aspect
@Repository
@Primary
@Qualifier("binarySearchImpl")
class BinarySearchImpl {
//    @Autowired
//    private SortAlgorithm sortAlgorithm;
//
//    public int binarySearch(int[] numbers, int numberToSearchFor){
//        int[] sortedNumbers = sortAlgorithm.sort(numbers);
//        System.out.println(sortAlgorithm);
//        System.out.println("In Binary Search");
//        return 0;
    }

