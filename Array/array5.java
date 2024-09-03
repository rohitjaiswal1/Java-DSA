package Array;

public class array5 {
    //Compute sum and average of array element
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;

        // access all element using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum = sum + number;
        }
        //get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average from int to double
        // convert the average from int todouble

        average = (double)sum / (double)arrayLength;
        System.out.println("sum = " + sum);
        System.out.println("length = " + arrayLength);
        System.out.println("average = " +average);
    }
}
