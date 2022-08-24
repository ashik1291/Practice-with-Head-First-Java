package com.LinkedListPractice;

import java.util.LinkedList;

public class getFirstLastItem {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Tina");
        name.add("Luna");
        name.add("Priyanka");

        var firstItem = name.getFirst();
        System.out.println(firstItem);
        var lastItem = name.getLast();
        System.out.println(lastItem);
    }
}
