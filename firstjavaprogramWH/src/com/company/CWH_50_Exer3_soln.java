package com.company;
import java.util.Random;
import java.util.Scanner;



class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 1;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); ;
    }

    void takeUserInput(){
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.printf("Yes u guessed right no : %d",number);
            System.out.println("");
            return true;
        }
        else if (inputNumber<number){
            System.out.println("too low...");
        }
        else if (inputNumber>number){
            System.out.println("too high...");
        }
        return false;
    }


}


public class CWH_50_Exer3_soln {
    public static void main(String[] args) {

        Game g = new Game();

        boolean b = false;
        System.out.println("guess no :" + g.getNoOfGuesses());
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
            System.out.println("");
        }









    }
}
