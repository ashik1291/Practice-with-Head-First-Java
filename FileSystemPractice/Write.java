package com.FileSystemPractice;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("name.txt");
        fileWriter.write("John Doe Karl Lenin");
        fileWriter.close();
        System.out.println("Successfully written");
    }
}
