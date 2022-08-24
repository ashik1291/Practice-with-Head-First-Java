package com.LinkedListPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseIterator {
    public static void main(String[] args) {
        LinkedList<Integer> ages = new LinkedList<Integer>(List.of(10, 20, 40, 5));

        Iterator agesIterator = ages.descendingIterator();

        while (agesIterator.hasNext()){
            System.out.println(agesIterator.next());
        }
    }
}
