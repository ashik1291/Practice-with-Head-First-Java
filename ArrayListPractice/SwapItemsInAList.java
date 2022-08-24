package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapItemsInAList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Lime");
        colors.add("Red");
        colors.add("White");

        try{
            Collections.swap(colors, 0, 3);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(colors);
    }
}
