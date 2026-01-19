package ex_16_Arrays;

import java.util.Scanner;

public class Lab117_2D_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 3");
        int n = scanner.nextInt();
        /*int  row= n;
        int col = 2*n-1;
        System.out.println("row = "+n+"\ncol = "+col);
         */
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            // print stars
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
