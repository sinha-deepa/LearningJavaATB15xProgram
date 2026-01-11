package exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_02_EvenOrOddNumber {
    public static void main(String[] args) {
        /*
        2) Even or Odd Number
            Description:
            Write a Java program to check whether a given number is even or odd using arithmetic operators.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's Even or Odd:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
