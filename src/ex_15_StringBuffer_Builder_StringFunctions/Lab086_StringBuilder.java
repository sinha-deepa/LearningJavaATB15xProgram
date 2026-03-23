package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab086_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Deepa");
        stringBuilder.append(123);
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); // dlroW olleH
        System.out.println(sb);


    }
}
