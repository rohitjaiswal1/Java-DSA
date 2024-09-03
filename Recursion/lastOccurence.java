package Recursion;
//Write a function to find the last occurence of an element in an array
public class lastOccurence {
    public static int LastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurence(arr, 5, 0));

    }
}
