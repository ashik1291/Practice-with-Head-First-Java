package com.LinkedListPractice;

import java.util.LinkedList;

public class InsertAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Tina");
        name.add("Luna");
        name.add("Priyanka");

        System.out.println(name);

        name.add(0, "Trisha");
        System.out.println(name);
    }
}
