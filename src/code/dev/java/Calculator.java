package code.dev.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scannerOp = new Scanner(System.in);
        boolean flag = true;
        try{
            while(flag) {
                System.out.println("_".repeat(50));
                System.out.println("Enter first number: ");
                double num1 = getOperator();
                System.out.println("Enter operator (+, -, *, /) or q to quit: ");
                String op = getOperation();
                System.out.println("Enter Second number: ");
                double num2 = getOperator();
                System.out.println("Result: " + calculate(num1, op, num2));

            }
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }
    }

    public static double getOperator() {
        Scanner scanner = new Scanner(System.in);
        double operator = 0;
        while(true) {
            if(scanner.hasNextDouble()) {
                operator = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input, please enter an number.");
                scanner.next();
            }
        }
        return operator;
    }

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        while(true) {
            operation = scanner.nextLine();
            if(operation.equals("+") || operation.equals("-" ) || operation.equals("*" ) || operation.equals("/" )) {
                return operation;
            } else {
                System.out.println("Invalid input, please enter a valid operation (+, -, * , /) ");
            }
        }
    }

    public static double calculate(double num1, String operation, double num2) {
        return switch(operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
    }
}


