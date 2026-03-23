package ex_14_String;

public class Lab080_Strings_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));

        String s2="HELLO";
        String s3= new String("world");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println("\""+s2.concat(" ").concat(s3.toUpperCase()).concat("!")+"\"");
    }
}
