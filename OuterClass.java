package com.headfirstJava;

public class OuterClass {
    private int size = 17;

    public class InnerClass{
        public int innerSize = 10;
    }

    public int getSize(){
        return size;
    }
}
