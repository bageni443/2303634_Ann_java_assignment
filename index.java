//Java Program for Surname and Age

import java.util.Scanner;

public class SurnameAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for surname and age
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Calculate the number of characters in surname
        int surnameLength = surname.length();
        System.out.println("The number of characters in your surname is " + surnameLength);
        
        // Check if age is even or odd
        if (age % 2 == 0) {
            System.out.println("Your age is an even number.");
        } else {
            System.out.println("Your age is an odd number.");
        }
        
        scanner.close();
    }
}

//Java Program to Compute Average Marks:
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int numberOfUnits = 5;
        
        // Ask user for marks of five units
        for (int i = 1; i <= numberOfUnits; i++) {
            System.out.print("Enter the marks for unit " + i + ": ");
            total += scanner.nextDouble();
        }
        
        // Calculate the average
        double average = total / numberOfUnits;
        System.out.printf("The average marks are: %.2f%n", average);
        
        scanner.close();
    }
}

//Java Program to Check Divisibility:
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check divisibility for numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
        }
        
        scanner.close();
    }
}

//Java Program to Display Multiples of 2, 3, and 7:
public class MultiplesFinder {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");
        
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

//Java Calculator Program:
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        // Perform the operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        
        // Display the result
        System.out.println("The result is: " + result);
        
        scanner.close();
    }
}

