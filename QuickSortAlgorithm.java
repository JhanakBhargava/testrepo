package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Qualifier("quickSortAlgorithm")
@Repository
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers){
        System.out.println("In QuickSort");
        return numbers;
    }
}
