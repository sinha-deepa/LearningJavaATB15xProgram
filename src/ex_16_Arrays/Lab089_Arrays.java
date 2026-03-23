package ex_16_Arrays;

public class Lab089_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int marks[] = {91, 90, 51, 100, 91, 92, 89};
        int[] marks2 = {91, 90, 51, 100, 91, 92, 89};

        boolean[] is_married_people = {true, true, false};
        String[] names = {"Deepa", "Kumari", "Sinha"};
        // Not allowed -> String [] names = {""Deepa", "Kumari", "Sinha",34};

        for (String item : names) {
            System.out.println(item);
        }

        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.14f;
        values[2] = 5.14f;
        // values[3] = 5.14f;
        System.out.println(values[2]);

        }
    }
