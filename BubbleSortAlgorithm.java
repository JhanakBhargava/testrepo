package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Qualifier("bubbleSortAlgorithm")
@Repository
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        System.out.println("In Bubble Sort");
        return numbers;
    }
}
