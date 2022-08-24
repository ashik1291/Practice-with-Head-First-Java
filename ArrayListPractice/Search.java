package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Kleo");
        name.add("John");
        name.add("Vinci");

        if (name.contains("Vinci")){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
