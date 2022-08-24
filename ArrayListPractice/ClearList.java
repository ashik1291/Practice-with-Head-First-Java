package com.ArrayListPractice;

import java.util.ArrayList;

public class ClearList {
    public static void main(String[] args) {
        ArrayList<String> colorList1= new ArrayList<String>();
        colorList1.add("Red");
        colorList1.add("Green");
        colorList1.add("Black");
        colorList1.add("White");
        colorList1.add("Pink");
        System.out.println("List of first array: " + colorList1);

        colorList1.clear();
        //or
        //colorList1.removeAll(colorList1);

        System.out.println(colorList1);
    }
}
