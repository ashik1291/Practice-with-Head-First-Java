package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();

        ages.add(20);
        ages.add(30);
        ages.add(5);

        Collections.sort(ages);
        for(int age: ages){
            System.out.println(age);
        }
    }
}
