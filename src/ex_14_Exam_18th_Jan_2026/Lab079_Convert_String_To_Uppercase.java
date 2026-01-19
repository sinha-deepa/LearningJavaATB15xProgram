/*
Program Name: Convert String to Uppercase
Description:
Write a Java program to convert a given string into uppercase and print the result.
 */

package ex_14_Exam_18th_Jan_2026;

import java.util.Scanner;

public class Lab079_Convert_String_To_Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        System.out.println("Uppercase string : "+str.toUpperCase());

    }
}
