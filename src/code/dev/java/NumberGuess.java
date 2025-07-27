package code.dev.java;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int numToGuess = random.nextInt(100);
        System.out.println("Number to guess is " + numToGuess);
        System.out.println("_".repeat(50));
        guessNumber(numToGuess);
    }

    public static void guessNumber(int numToGuess) {
        int num;
        int attempts = 0;
        boolean isNumGuessed = false;
        while(!isNumGuessed) {
            System.out.println("Enter number: ");
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                attempts++;

                if(num == numToGuess) {
                    System.out.println("You have successfully guessed the correct number which is " + num + " You took " + attempts + "attempts");
                    System.out.println("_".repeat(50));
                    isNumGuessed = true;
                } else {
                    if(num > numToGuess) {
                        System.out.println("Guess lower number than " + num);
                    } else {
                        System.out.println("Guess greater number than " + num);
                    }
                    System.out.println("_".repeat(50));
                }

            } else {
                System.out.println("Invalid input entered. Please enter correct number ");
                scanner.next();
            }
        }

    }
}
