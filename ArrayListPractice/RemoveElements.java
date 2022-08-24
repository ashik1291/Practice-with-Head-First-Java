package com.ArrayListPractice;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList <Integer> ages = new ArrayList<Integer>();

        ages.add(20);
        ages.add(30);
        ages.add(5);
        ages.remove(1);
        for(int age: ages){
            System.out.println(age);
        }
    }
}
