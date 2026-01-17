package ex_12_Do_While;

import java.sql.SQLOutput;

public class Lab066_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 1;
        while(a<=10){
            System.out.println("while executed : "+a);
            a++;
        }
        int i = 10;
        do{
            System.out.println("Do-While executed : "+i);
            i--;
        }while(i>=10);
    }
}
