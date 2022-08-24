package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        List<String> colorList1 = Arrays.asList("Red", "Blue", "White", "Indigo", "Yellow");
        List<String> colorList2 = Arrays.asList("Red", "Purple", "White", "Yellow");

        ArrayList<String> comparisonOutput = new ArrayList<String>();

        for(String item: colorList1){
            comparisonOutput.add(colorList2.contains(item)?"Yes":"No");
        }

        System.out.println(comparisonOutput);
    }
}
