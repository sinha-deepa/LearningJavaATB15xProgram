package ex_14_String;

import java.util.Scanner;

public class Lab075_String_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = scanner.nextLine();
        StringBuilder reversedStr = new StringBuilder();
        for(int i= str.length()-1; i>=0;i--){
            reversedStr=reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr);
    }
}
