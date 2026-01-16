package ex_04_Ternary_Operator;

public class Lab016_Ternary_Operator_07 {
    public static void main(String[] args) {
        int x=567890;
        int y=2345678;
        int max = x>y?x:y;
        System.out.println("Max is "+max);
        int min = x>y?y:x;
        System.out.println("Min is "+min);
    }
}
