package Recursion;
//write a function to find the first occurence of an element in an array
public class firstOccurence {
    public static int FirstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(FirstOccurence(arr, 5, 0));

    }
}
