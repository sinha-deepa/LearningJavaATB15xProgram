package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab084_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Deepa";
        String s1 = new String("Deepa");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Deepa");
        StringBuilder stringBuilder = new StringBuilder("Deepa");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
