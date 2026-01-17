package ex_14_String;

public class Lab057_Second_Highest_Number_In_Array {
    public static void main(String[] args) {
        /*
        Find the 2nd Highest in Array(no in built function)
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
         */
        int[] numbers={12, 34, 10, 1, 100, 2, 4, 32};
        int highest = numbers[0];
        int secondHighest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            }
            else if (numbers[i] > secondHighest && numbers[i] != highest) {
                secondHighest = numbers[i];
            }
        }
        System.out.println("Second highest number in given array : " + secondHighest);
    }
}
