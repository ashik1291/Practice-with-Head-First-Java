package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List <String> firstName = new ArrayList<String>();
        firstName.add("Kleo");
        firstName.add("John");
        firstName.add("Vinci");

        List <String> lastName = new ArrayList<String>();
        lastName.add("Petra");
        lastName.add("Doe");
        lastName.add("Daemon");
        Collections.copy(firstName, lastName);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
