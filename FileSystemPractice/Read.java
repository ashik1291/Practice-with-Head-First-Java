package com.FileSystemPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("name.txt");
        Scanner scanner = new Scanner(myFile);
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
