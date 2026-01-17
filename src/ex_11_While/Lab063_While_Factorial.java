package ex_11_While;

import java.util.Scanner;

public class Lab063_While_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for finding factorial : ");
        int n = scanner.nextInt();
        int fact = 1;
        int i = 1;
        if(n>=0) {
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial : " + fact);
        }else{
            System.out.println("Enter the positive number for factorial");
        }
    }
}
