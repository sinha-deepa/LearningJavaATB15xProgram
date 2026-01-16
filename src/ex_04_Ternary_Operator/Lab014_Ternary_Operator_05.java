package ex_04_Ternary_Operator;

public class Lab014_Ternary_Operator_05 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = -9;
        String  numtype1= num1>=0? "+ve":"-ve";
        System.out.println(num1+" is "+numtype1);
        String  numtype2= num2>=0? "+ve":"-ve";
        System.out.println(num2+" is "+numtype2);
    }
}
