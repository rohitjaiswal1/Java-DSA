package Array;

public class array6 {
    public static void main(String[] args) {
        //an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        for (int number: numbers) {
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }
}
