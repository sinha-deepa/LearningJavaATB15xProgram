package ex_09_Switch;

import java.util.Scanner;

public class Lab035_Web_Automation_Usage {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name to start automation:");
        String browser = scanner.nextLine();
        browser = browser.toLowerCase();
        switch(browser){
            case "chrome":
                System.out.println("This is Chrome Browser. I will start automation in Chrome.");
                break;
            case "firefox":
                System.out.println("This is Firefox Browser. I will start automation in Firefox.");
                break;
            case "safari":
                System.out.println("This is Safari Browser. I will start automation in Safari.");
                break;
            case "edge":
                System.out.println("This is Edge Browser. I will start automation in Edge.");
                break;
            default:
                System.out.println("Invalid Browser Name. Please enter a valid browser name.");
        }
    }
}
