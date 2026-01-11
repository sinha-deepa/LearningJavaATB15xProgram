package exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_11_ReverseANumber {
    public static void main(String[] args) {
        /*
        11) Reverse a Number
        Description:
        Write a Java program to reverse a given number using a do-while loop.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 6 digit number:");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
