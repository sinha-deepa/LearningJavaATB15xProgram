package ex_07_exam_01_11thJan2026_CoreJava;

public class Q_03_ExplicitTypeCasting {
    public static void main(String[] args) {
        /*
        3) Explicit Type Casting
            Description:
            Write a Java program to convert a double value into an int using explicit type casting and print both values.
         */
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted Integer value: " + intValue);
    }
}
