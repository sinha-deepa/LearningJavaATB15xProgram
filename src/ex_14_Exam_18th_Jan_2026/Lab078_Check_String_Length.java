/*
Program Name: Check String Length
Description:
Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
 */

package ex_14_Exam_18th_Jan_2026;

import java.util.Scanner;

public class Lab078_Check_String_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        int length = str.length();
        if(str.length()>10) {
            System.out.println("String length is greater than 10 and length : " + length);
        }else{
            System.out.println("String length is not greater than 10 and length : " + length);
        }
    }
}
