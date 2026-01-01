/*
Question

int a = 10;
a = a++ + a++ + a++;
System.out.println(a);//33
int a = 3;
int b = a++ * ++a;
System.out.println(b); //15
int a = 5;
System.out.println(a++ + a--);//11
 */

package ex_07_Custom_Input;

public class Lab020_Increment_Decrement_04 {
    public static void main(String[] args){
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);//33

        int a1 = 3;
        int b = a1++ * ++a1;
        System.out.println(b); //15

        int a2 = 5;
        System.out.println(a2++ + a2--);//11


    }
}
