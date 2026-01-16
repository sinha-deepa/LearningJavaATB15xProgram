package ex_07_exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_05_PositiveNegativeOrZero {
    public static void main(String[] args) {
        /*
        5) Positive, Negative or Zero
            Description:
            Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        String result1 = (number1 > 0) ? "Positive" : (number1 < 0) ? "Negative" : "Zero";
        System.out.println("The number " + number1 + " is: " + result1);
    }
}
