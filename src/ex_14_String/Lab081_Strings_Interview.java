package ex_14_String;

public class Lab081_Strings_Interview {
    public static void main(String[] args) {
        String name = "deepa";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println("*******************");
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == Comparsion - String check the ref in String.

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals ( content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // equla operator assignment the value

        System.out.println("********************");
        String t1 = "Hello";
        String t4 = "Hello";
        String t10 = "Hello";
        String t11 = "hello";



        String t2 = new String("Hello");
        String t3 = new String("Hello");
        String t5 = new String("hello");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(t2 == t3);

        System.out.println(t1 == t4);
        System.out.println(t3 == t5);

        // equals ( content) -> value
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t3.equals(t5));
        System.out.println(t3.equalsIgnoreCase(t5));

    }
}
