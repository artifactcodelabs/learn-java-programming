package code.dev.java;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            printTable(num);
        } else {
            System.out.println("Invalid input entered. Please enter correct number ");
            scanner.next();
        }
    }

    public static void printTable(int num) {
        for(int i=1;i<=10; i++) {
            System.out.format("%d x %d = %d%n", num, i, num * i);
        }
    }
}
