package ex_08_If_Condition;

import java.util.Scanner;

public class Lab032_Interview_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        if(num>18){
            System.out.println("Greater than 18");
        }
        else if (num<=18){
            System.out.println("Not greater than 18");
        }else {
            System.out.println("Invalid input");
        }
    }
}
