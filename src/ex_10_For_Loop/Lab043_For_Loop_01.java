package ex_10_For_Loop;

public class Lab043_For_Loop_01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("..");
        System.out.println(10);

        /*
        For Loop
        Help you to repeat a block of code.
        Initialization -> Condition -> Updation(Increment/decrement)
        ICU
        for(I;C;U){
        this is the code that you want to execute multiple times
         */
        //Using For Loop
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
