package com.headfirstJava;

public class OuterClassTestDrive {
    public static void main(String[] args) {
        System.out.println("Hello");

        OuterClass outerClassObj = new OuterClass();
        System.out.println(outerClassObj.getSize());
        OuterClass.InnerClass inncerClass = new OuterClass().new InnerClass();
        System.out.println(inncerClass.innerSize);
    }
}
