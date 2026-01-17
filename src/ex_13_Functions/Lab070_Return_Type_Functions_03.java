package ex_13_Functions;

public class Lab070_Return_Type_Functions_03 {
    static void function_01(){
        System.out.println("no return type");
    }
    static int function_02(){
        int num= 1;
        System.out.println("int return type");
        return num;
    }

    static boolean function_03(){
        boolean flag= true;
        System.out.println("Boolean return type");
        return flag;
    }

    static char function_04(){
        char c= 'A';
        System.out.println("char return type");
        return c;
    }

    static float function_05(){
        float f= 3.14f;
        System.out.println("float return type");
        return f;
    }

    static double function_06(){
        double d= 54.14;
        System.out.println("double return type");
        return d;
    }
    static long function_07(){
        long l = 1L;
        System.out.println("long return type");
        return l;
    }

    public static void main(String[] args) {
        function_01();
        function_02();
        function_03();
        function_04();
        function_05();
        function_06();
        function_07();
    }
}
