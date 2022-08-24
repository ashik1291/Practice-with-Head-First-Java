package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Orange", "White", "Black");

        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
