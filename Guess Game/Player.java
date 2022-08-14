package com.headfirstJava;

public class Player {
    int guessedNumber;

    void guess(){
        guessedNumber = (int) (Math.random() * 10);
    }
}
