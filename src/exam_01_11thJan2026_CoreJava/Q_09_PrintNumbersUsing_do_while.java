package exam_01_11thJan2026_CoreJava;

public class Q_09_PrintNumbersUsing_do_while {
    public static void main(String[] args) {
        /*
        9) Print Numbers Using do-while
        Description:
        Write a Java program to print numbers from 1 to 10 using a do-while loop.
         */
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }
}
