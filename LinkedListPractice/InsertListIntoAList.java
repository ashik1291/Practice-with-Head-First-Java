package com.LinkedListPractice;

import java.util.LinkedList;

public class InsertListIntoAList {
    public static void main(String[] args) {
        LinkedList <String> city = new LinkedList<>();
        city.add("Cumilla");
        city.add("Chittagong");
        city.add("Jessore");
        System.out.println(city);

        LinkedList <String> city2 = new LinkedList<>();
        city2.add("Dhaka");
        city2.add("Barisal");

        city.addAll(0, city2);
        System.out.println(city);

    }
}
