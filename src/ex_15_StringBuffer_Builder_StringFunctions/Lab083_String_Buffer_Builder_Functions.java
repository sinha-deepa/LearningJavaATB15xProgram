package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab083_String_Buffer_Builder_Functions {
    public static void main(String[] args) {
        String name = "Deepa";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Kumari"));

        // 3. contains()
        System.out.println(name.contains("pa"));

        // 4. equals()
        System.out.println(name.equals("Deepa"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("deepa"));

        // 6. indexOf() //  deepa -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('p', 'P'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("DEEPA".toLowerCase());

        // 12. toUpperCase()
        System.out.println("deepa".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("D"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    deepa sinha     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Deepa"));


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Deepa");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
