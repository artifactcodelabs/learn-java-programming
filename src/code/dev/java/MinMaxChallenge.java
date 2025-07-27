package code.dev.java;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        while(true) {
            int userInput = getNumber(); // 45, 23, 87
            if(numberList.isEmpty()) {
                numberList.add(userInput);
                getMinMax(numberList);

            } else {
                boolean isNumberAdded = false;
                for(int i = 0; i < numberList.size(); i++ ) { // [23, 45]
                    if(userInput <= numberList.get(i)) {
                        numberList.add(i, userInput);
                        isNumberAdded = true;
                        break;
                    }
                }
                if(!isNumberAdded) {
                    numberList.add(userInput);
                }

                getMinMax(numberList);
            }
        }
    }

    public static void getMinMax(ArrayList<Integer> numberList) {
        System.out.println("Min is " + numberList.get(0) + " and Max is " + numberList.get(numberList.size()-1));
        System.out.println("-".repeat(50));
    }

    public static int getNumber() {
        int num;
        while(true) {
            System.out.println("Enter the number: ");
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input, please enter an number.");
                scanner.next();
            }
        }
        return num;
    }


}
