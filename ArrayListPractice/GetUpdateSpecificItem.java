package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class GetUpdateSpecificItem {
    public static void main(String[] args) {
        List <String> name = new ArrayList<String>();
        name.add("Kleo");
        name.add("John");
        name.add("Vinci");

        System.out.println(name.get(0));

        name.set(0,"Regina");
        System.out.println(name);
    }

}
