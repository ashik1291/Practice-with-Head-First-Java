package com.headfirstJava;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    boolean p1IsRight = false;
    boolean p2IsRight = false;
    boolean p3IsRight = false;

    void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int number = (int) (Math.random() * 10);
        System.out.println("Number to guess is "+ number);

        while(true){

            p1.guess();
            p2.guess();
            p3.guess();

            System.out.println("P1 guessed " + p1.guessedNumber);
            if(p1.guessedNumber == number) p1IsRight = true;
            System.out.println("P2 guessed " + p2.guessedNumber);
            if(p2.guessedNumber == number) p2IsRight = true;
            System.out.println("P3 guessed " + p3.guessedNumber);
            if(p3.guessedNumber == number) p3IsRight = true;

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner");
                System.out.println("is P1 right? - " + p1IsRight);
                System.out.println("is P2 right? - " + p2IsRight);
                System.out.println("is P3 right? - " + p3IsRight);
                break;
            }else{
                System.out.println("Try again");
            }

        }
    }
}
