package exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_07_SimpleCalculator {
    public static void main(String[] args) {
        /*
        7) Simple Calculator
            Description:
            Write a Java program that functions as a simple calculator. It should take two numbers and an operator (+, -, *, /) as input and perform the corresponding arithmetic operation.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for division");
        System.out.println("Enter 4 for multiplication");
//        System.out.println("Enter 5 for modulus");
        int result = scanner.nextInt();
        switch (result) {
            case 1:
                System.out.println("the sum of numbers is " + (number1 + number2));
                break;
            case 2:
                System.out.println("the difference of numbers is " + (number1 - number2));
                break;
            case 3:
                System.out.println("the multiplication of numbers is " + number1 * number2);
                break;
            case 4:
                System.out.println("the division of numbers is " + number1 / number2);
                break;
//            case 5:
//                System.out.println("the modulus of numbers is " + number1 % number2);
//                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
