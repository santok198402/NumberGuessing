package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int num= rand.nextInt(100);//0-100
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You will be asked to guess a number to win the game");
        System.out.println("You have maximum 5 attempt limit");
        int limit=5;
        while(limit>0){
            System.out.println("Enter a guess number between 1-100");
            int number=sc.nextInt();
            if(number==num){
                System.out.println("Ohoo you won the game");
            }
           else if(number>num){
                System.out.println("Your guess number is Greater");
            }
            else{
                System.out.println("Your guess number is Smaller");
            }
            limit--;
        }
        if(limit==0){
            System.out.println("Sorry you lost the game");
            System.out.println("The correct answer is "+num);
        }
    }
}
