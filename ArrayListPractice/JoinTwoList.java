package com.ArrayListPractice;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList<String> colorList1= new ArrayList<String>();
        colorList1.add("Red");
        colorList1.add("Green");
        colorList1.add("Black");
        colorList1.add("White");
        colorList1.add("Pink");
        System.out.println("List of first array: " + colorList1);
        ArrayList<String> colorList2= new ArrayList<String>();
        colorList2.add("Red");
        colorList2.add("Green");
        colorList2.add("Black");
        colorList2.add("Pink");
        System.out.println("List of second array: " + colorList2);

        ArrayList<String> mergedList = new ArrayList<>();

        mergedList.addAll(colorList1);
        mergedList.addAll(colorList2);
        System.out.println(mergedList);
    }
}
