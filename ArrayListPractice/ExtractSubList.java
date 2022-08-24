package com.ArrayListPractice;

import java.util.Arrays;
import java.util.List;

public class ExtractSubList {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Black", "White", "Indigo", "Yellow");

        System.out.println(colors);

        List<String> colorsSubList = colors.subList(1,4);
        System.out.println(colorsSubList);
    }
}
