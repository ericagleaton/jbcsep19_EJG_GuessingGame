package com.company;
//Repeating yourself with a while loop

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0, counter=0;//guess is initialized to 0
        Random random = new Random();
        secretNumber = random.nextInt(10);

        System.out.println("I'm thinking of a number between 1 and 10");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber )
        {
            counter++;
            System.out.println("\nYour guess #" + counter + ", with the value of "+ guess + " was incorrect. Guess again.");
            if(guess>secretNumber) {
                System.out.println("\tHint: Your guess was too high, choose a number lower.\n\nTry again with guess #" + (counter+1) + ".\n");
            }
            else {
                System.out.println("\tHint: Your guess was too low choose a number higher.\n\nTry again with guess #" + (counter+1) + ".\n");
            }
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
        }

        System.out.println("Your guess " + guess + " is correct. You win a prize!");
        System.out.println("It took " + (counter+1) + " guesses to win.");
        keyboard.close();
    }
}