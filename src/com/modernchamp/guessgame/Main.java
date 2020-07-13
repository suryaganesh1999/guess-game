package com.modernchamp.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("<< Welcome to the Guess Game >>");
        Scanner sc=new Scanner(System.in);
        System.out.println("What's your name ??");
        String s=sc.nextLine();
        System.out.println("Hello "+s);
        System.out.println("Shall we start the Game :[Y/N]");
        String respone=sc.next();
        if(respone.toUpperCase().equals("Y")){
            while (true){
                System.out.println("Guess a number between 1 and 24 :");
                Random random=new Random();
                int number=random.nextInt(25);
                int i=0;
                while (i < 5) {
                    i++;
                    int currentNumber = sc.nextInt();
                    if (currentNumber == number) {
                        System.out.println("Congratulations !!" + s + " You won.");
                        break;
                    } else if (currentNumber > number) {
                        System.out.println("Quess the number lower than " + currentNumber);
                    } else {
                        System.out.println("Quess the number higher than " + currentNumber);
                    }
                    if (i == 5) {
                        System.out.println("You lost "+ s +" :(");
                    }
                }
                System.out.println("Do you want to play again ?[Y/N]");
                String res=sc.next();
                if(!res.equals("Y")) {
                    break;
                }
            }
            System.out.println("Thanks for playing with us.");
        }else{
            System.out.println("Have a Good Day :)");
        }

    }
}