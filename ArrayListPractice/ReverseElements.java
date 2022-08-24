package com.ArrayListPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElements{
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Orange", "White", "Black");

        Collections.reverse(colors);
        System.out.println(colors);
    }
}
