package ex_07_exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_04_MaximumOfTwoNumbers {
    public static void main(String[] args) {
        /*
        4) Maximum of Two Numbers
            Description:
            Write a Java program to find the maximum of two numbers using the ternary operator.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        int max1 = (number1 > number2) ? number1 : number2;
        System.out.println("Using ternary operator,The maximum of " + number1 + " and " + number2 + " is: " + max1);
        int max2 = Math.max(number1, number2);
        System.out.println("Using Math.max, the maximum of " + number1 + " and " + number2 + " is: " + max2);
    }
}
