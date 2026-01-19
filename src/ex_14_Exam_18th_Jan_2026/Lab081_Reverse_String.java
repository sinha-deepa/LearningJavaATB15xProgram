/*
Program Name: Reverse a String
Description:
Write a Java program to reverse a given string using a loop.
 */

package ex_14_Exam_18th_Jan_2026;

import java.util.Scanner;

public class Lab081_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        String reverseStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverseStr = reverseStr + (str.charAt(i));
        }
        System.out.println("Reversed String: " + reverseStr);
    }
}
