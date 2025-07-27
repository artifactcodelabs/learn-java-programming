package code.dev.java;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Do you want to play the prime number game (enter y(es) or n(o): ");
        String choice = getChoice();
        while(choice.equalsIgnoreCase("y")) {


            boolean isPrime = true;
            System.out.println("Enter a number: ");
            int num = getNumber();
            if(num <= 1) {
                isPrime = false;
                System.out.println("Entered number is not a prime number");
            } else {
                for(int i=2;i<Math.sqrt(num);i++) {
                    if(num % i == 0) {
                        System.out.println("Entered number is a not prime number");
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.println("Entered number is a prime number");
                }
            }
            System.out.println("Do you want to continue: ");
            choice = getChoice();
        }

    }

    public static String getChoice() {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        while(true) {
            operation = scanner.nextLine().substring(0,1);
            if(operation.equalsIgnoreCase("y") || operation.equalsIgnoreCase("n" )) {
                return operation;
            } else {
                System.out.println("Invalid input, please enter a valid choice ");
            }
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        if(scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Invalid input entered. Please enter correct number ");
            scanner.next();
        }
        return age;
    }
}
