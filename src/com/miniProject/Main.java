package com.miniProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //START

	int myNumber= (int)(Math.random()*100);
        int guessNumber;
	do {
        System.out.println("Guess my number(1 - 100)");
        Scanner in = new Scanner(System.in);
        guessNumber=in.nextInt();

        if(guessNumber==myNumber){
            System.out.println("Wooho.. Correct!");
            break;
        }
        else if(guessNumber<myNumber){
            System.out.println("Try a larger number");
        }
        else {
            System.out.println("Try a smaller number");
        }


    } while (guessNumber>=0);
        System.out.println("My number is :"+myNumber);

	//END
    }
}
