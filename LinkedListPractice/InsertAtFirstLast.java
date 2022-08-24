package com.LinkedListPractice;

import java.util.LinkedList;

public class InsertAtFirstLast {
    public static void main(String[] args) {
        LinkedList <Double> weight = new LinkedList<>();
        weight.add(50.5);
        weight.add(45.2);
        weight.add(68.7);
        System.out.println(weight);

        weight.addFirst(20.9);
        System.out.println(weight);
        weight.addLast(90.4);
        System.out.println(weight);
    }
}
