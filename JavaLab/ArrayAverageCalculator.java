package JavaLab;
//Write a program that creates and initializes a four-element int array. Calculate and display the average of its values
public class ArrayAverageCalculator {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        float average;
        float sum = 0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        average=sum/ arr.length;
        System.out.println("Average" +average);
    }
}
