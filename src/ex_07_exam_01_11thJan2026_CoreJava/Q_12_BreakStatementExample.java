package ex_07_exam_01_11thJan2026_CoreJava;

public class Q_12_BreakStatementExample {
    public static void main(String[] args) {
        /*
        12) Break Statement Example
        Description:
        Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
