package ex_04_Ternary_Operator;

public class Lab011_Ternary_Operator_02 {
    public static void main (String[] args){
        int marks = 64;
        String result = (marks>=40)?"Pass":"Fail";
        System.out.println("The result is "+result);
        marks = 40;
        String result1 = (marks>=40)?"Pass":"Fail";
        System.out.println("The result is "+result1);
        marks = 39;
        String result2 = (marks>=40)?"Pass":"Fail";
        System.out.println("The result is "+result2);
    }
}
