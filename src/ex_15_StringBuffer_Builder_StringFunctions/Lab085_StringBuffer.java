package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab085_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Deepa");
        stringBuffer.append("Kumari");
        System.out.println(stringBuffer);


        String s1 = "Deepa";
        s1 = s1+ "Sinha";
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
