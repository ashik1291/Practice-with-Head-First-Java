package com.FileSystemPractice;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("Name.txt");
        if (myFile.createNewFile()){
            System.out.println("File created and file name: "+myFile.getName());
        }else{
            System.out.println("File already exists!");
        }
    }
}
