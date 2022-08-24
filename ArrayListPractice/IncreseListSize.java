package com.ArrayListPractice;

import java.util.ArrayList;

public class IncreseListSize {
    public static void main(String[] args) {
        ArrayList<Integer> roll = new ArrayList<Integer>(3);
        roll.add(2);
        roll.add(3);
        roll.add(1);

        roll.ensureCapacity(6);
        roll.add(4);

        System.out.println(roll);

    }
}
