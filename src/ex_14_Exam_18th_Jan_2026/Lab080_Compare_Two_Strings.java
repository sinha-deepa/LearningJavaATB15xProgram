/*
Program Name: Compare Two Strings
Description:
Write a Java program to compare two strings and check whether they are equal or not.
 */

package ex_14_Exam_18th_Jan_2026;

import java.util.Scanner;

public class Lab080_Compare_Two_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string :");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string");
        String str2 = scanner.nextLine();
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal");
        }
    }
}
