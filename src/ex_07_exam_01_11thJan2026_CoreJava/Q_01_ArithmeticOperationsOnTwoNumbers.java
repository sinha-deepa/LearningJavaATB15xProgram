package ex_07_exam_01_11thJan2026_CoreJava;
import java.util.Scanner;

public class Q_01_ArithmeticOperationsOnTwoNumbers {
    public static void main(String[] args) {

        /*
        1) Arithmetic Operations on Two Numbers
            Description:
            Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("the sum of numbers is "+(num1+num2));
        System.out.println("the difference of numbers is "+(num1-num2));
        System.out.println("the multiplication of numbers is "+num1*num2);
        System.out.println("the division of numbers is "+num1/num2);
        System.out.println("the remainder of numbers is "+num1%num2);
    }
}
