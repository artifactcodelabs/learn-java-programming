package code.dev.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        try{
            System.out.println("Enter number: ");
            checkPalindromeNumber();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input. Enter correct number ");
            checkPalindromeNumber();
        }
    }

    public static void checkPalindromeNumber() {
        Scanner scanner = new Scanner(System.in);
        int input =  scanner.nextInt();
        int reverseNum = 0;
        while(input > 0) {
            reverseNum = (reverseNum * 10) + input % 10;
            input = input / 10;
        }

        if( input == reverseNum) {
            System.out.println("This is a PALINDROME");
        } else {
            System.out.println("This is not a PALINDROME");
        }
    }

    public static void checkPalindromeString() {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        String reversInput = new StringBuilder(input).reverse().toString();
        if(input.equalsIgnoreCase(reversInput)) {
            System.out.println("This is a PALINDROME");
        } else {
            System.out.println("This is not a PALINDROME");
        }
    }


}
