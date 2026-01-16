package ex_09_Switch;

public class Lab041_Interview_01 {
    public static void main(String[] args) {
        switch (-1) {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
