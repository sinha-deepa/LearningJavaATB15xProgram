package ex_14_String;

public class Lab077_String_Immutable {
    public static void main (String[] args){
        String name = "Deepa";
        boolean result = name.contains("p");
        System.out.println(result);

//         String are immutable are in nature.

        name.toUpperCase();
        System.out.println(name);
    }
}
