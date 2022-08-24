package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TrimCapacity {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<String>();
        firstName.add("Kleo");
        firstName.add("John");
        firstName.add("Vinci");
        firstName.add("Leo");
        firstName.add("Christiano");

        firstName.trimToSize();
        System.out.println(firstName);
    }
}
