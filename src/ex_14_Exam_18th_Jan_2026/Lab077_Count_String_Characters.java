/*
Program Name: Count Characters in a String
Description:
Write a Java program to count the total number of characters in a given string (excluding spaces).
 */

package ex_14_Exam_18th_Jan_2026;

import java.util.Scanner;

public class Lab077_Count_String_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) !=' '){
                count++;
            }
        } System.out.println("Total number of character (excluding spaces) :" + count);
        }
    }
