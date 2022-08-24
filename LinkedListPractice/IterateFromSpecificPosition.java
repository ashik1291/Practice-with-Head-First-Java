package com.LinkedListPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateFromSpecificPosition {
    public static void main(String[] args) {
        LinkedList <Integer> ages = new LinkedList<Integer>(List.of(10, 20, 40, 5));

        Iterator ageIterator = ages.listIterator(2);
        while (ageIterator.hasNext()){
            System.out.println(ageIterator.next());
        }
    }
}
