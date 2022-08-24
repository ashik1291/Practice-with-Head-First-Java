package com.ArrayListPractice;

import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList<String> colorList1= new ArrayList<String>();
        colorList1.add("Red");
        colorList1.add("Green");
        colorList1.add("Black");
        colorList1.add("White");
        colorList1.add("Pink");
        System.out.println("List of first array: " + colorList1);

        ArrayList<String> cloneList = (ArrayList<String>) colorList1.clone();
        System.out.println(cloneList);
    }
}
