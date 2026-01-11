package exam_01_11thJan2026_CoreJava;

import java.util.Scanner;

public class Q_06_DayOfTheWeek {
    public static void main(String[] args) {
        /*
        6) Day of the Week
        Description:
        Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of day of a week:");
        int dayNo = scanner.nextInt();
        switch(dayNo){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
        }
    }
}
