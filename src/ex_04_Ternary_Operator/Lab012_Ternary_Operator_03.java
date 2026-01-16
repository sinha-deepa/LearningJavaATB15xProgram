package ex_04_Ternary_Operator;

public class Lab012_Ternary_Operator_03 {
    public static void main(String[] args){
        byte age = 40;
        String goGoa = age>18? (age>25? "Yes he can go to goa and drink":"he can go to goa but he can't drink"):"He can't Go to Goa";
        System.out.println("Can he go to goa and drink? "+goGoa);
        byte age1 = 17;
        String goGoa1 = age1>18? (age1>25? "Yes he can go to goa and drink":"He can go to goa but he can't drink"):"He can't Go to Goa";
        System.out.println("Can he go to goa and drink? "+goGoa1);
        byte age2 = 24;
        String goGoa2 = age2>18? (age2>25? "Yes he can go to goa and drink":"He can go to goa but he can't drink"):"he can't Go to Goa";
        System.out.println("Can he go to goa and drink? "+goGoa2);
    }
}
