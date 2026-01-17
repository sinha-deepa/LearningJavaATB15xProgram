package ex_10_For_Loop;

import java.util.Scanner;

public class Lab056_For_Loop_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive integer for factorial : ");
        int n = scanner.nextInt();
        int fact = 1;
        if (n>=0) {
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }System.out.println("Factorial : "+fact);
    }else {
            System.out.println("Please enter a valid int value");
        }
        scanner.close();
    }
}
