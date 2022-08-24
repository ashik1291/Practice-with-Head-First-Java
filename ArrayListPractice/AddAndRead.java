package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAndRead {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("John");
        name.add("Karl");
        name.add("Lenin");
        name.add(1, "Shreya");

        Iterator iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
