package com.LinkedListPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>(List.of("Red", "Yellow", "White"));

        for(String color:colors){
            System.out.println(color);
        }
        // or
        /*
        Iterator colorsIterator = colors.iterator();

        while (colorsIterator.hasNext()){
            System.out.println(colorsIterator.next());
        }
         */
    }
}
