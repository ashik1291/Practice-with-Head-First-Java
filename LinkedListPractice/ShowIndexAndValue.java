package com.LinkedListPractice;

import java.util.LinkedList;

public class ShowIndexAndValue {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Tina");
        name.add("Luna");
        name.add("Priyanka");

        for(int i = 0; i < name.size(); i++){
            System.out.println("Index: "+i+", Value: "+name.get(i));
        }
    }
}
