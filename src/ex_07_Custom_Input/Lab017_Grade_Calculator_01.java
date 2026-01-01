package ex_07_Custom_Input;

import java.util.Scanner;

/*
Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical
score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
 */

public class Lab017_Grade_Calculator_01 {
    public static void main (String[] args){
        System.out.println("Enter marks obtained");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered.");

        }
    }
}
