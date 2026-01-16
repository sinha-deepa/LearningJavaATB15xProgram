package ex_04_Ternary_Operator;

public class Lab015_Ternary_Operator_06 {
    public static void main(String[] args) {
        int num1=23;
        String numType1 = num1%2==0? "Even":"Odd";
        System.out.println(num1+" is "+numType1);
        int num2=10;
        String numType2 = num2%2==0? "Even":"Odd";
        System.out.println(num2+" is "+numType2);
        int num3=0;
        String numType3 = num3%2==0? "Even":"Odd";
        System.out.println(num3+" is "+numType3);
    }
}
