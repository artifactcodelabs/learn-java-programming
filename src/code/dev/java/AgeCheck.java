package code.dev.java;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = getAge();
        System.out.println(ageClassification(age));

    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        if(scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Invalid input entered. Please enter correct age ");
            scanner.next();
        }
        return age;
    }

    public static String ageClassification(int age) {
        if (age >= 0 && age <= 14) return "Children: 0–14 years";
        else if (age >= 15 && age <= 24) return "Youth: 15–24 years";
        else if (age >= 25 && age <= 64) return "Adults: 25–64 years";
        else if (age >= 65) return "Seniors: 65 years and older";
        return "Unknown";
    }
}
