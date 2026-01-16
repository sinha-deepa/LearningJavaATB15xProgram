package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Multi_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();
        System.out.println("sum of all number is: " + (num1 + num2 + num3));
    }
}
