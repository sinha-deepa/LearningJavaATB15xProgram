package ex_07_exam_01_11thJan2026_CoreJava;

public class Q_10_PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        10) Print Even Numbers
        Description:
        Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
         */
        int i = 1;
        System.out.println("Even numbers between 1 and 50 are:");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
