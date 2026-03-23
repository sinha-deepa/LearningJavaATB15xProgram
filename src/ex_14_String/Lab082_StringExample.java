package ex_14_String;

public class Lab082_StringExample {
    public static void main(String[] args) {
        System.out.println("******Example 1**********");
        CharSequence name = "Deepa";
        System.out.println(name);
        System.out.println(name.subSequence(1,4));

        System.out.println("******Example 2**********");
        String s= "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "ABC".compareTo("abc");
        int result1 = "abc".compareTo("abc");
        int result2 = "abc".compareTo("ABC");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // true
        System.out.println(b2);


        System.out.println("******Example 3**********");

        String s10 = "Java".substring(2);
        System.out.println(s10);

        // "unhappy".substring(2) returns "happy" "
        // Harbison".substring(3) returns "bison"
        // "emptiness".substring(9) returns "" (an empty string)


        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean blank = "   ".isBlank();
        boolean b3 = "".isEmpty();
        System.out.println(blank);

        String s2 = "ab".repeat(3);
        String s3 = "Pramod".repeat(3);
        System.out.println(s3);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nblank\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we got!!");
        System.out.println("=".repeat(10));

    }
}
