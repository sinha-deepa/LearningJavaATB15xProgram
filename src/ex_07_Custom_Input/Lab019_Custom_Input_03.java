/*
Triangle Classifier:

Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle.
 */

package ex_07_Custom_Input;

import java.util.Scanner;

public class Lab019_Custom_Input_03 {
    public static void main(String[] args){
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter Side A length: ");
        double a= scanner.nextInt();
        System.out.println("Enter Side B length: ");
        double b= scanner.nextDouble();
        System.out.println("Enter Side C length: ");
        double c= scanner.nextDouble();
        // Check if valid triangle first
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Sides Belongs to Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Sides Belongs to Isosceles Triangle");
            } else {
                System.out.println("Sides Belongs to Scalene Triangle");
            }
        }else {
            System.out.println ("Invalid triangle sides");
        }

    }
}
