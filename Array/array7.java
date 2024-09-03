package Array;

public class array7 {
    //Check the element of array in sorted order
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; //Array is not sorted
            }
        }
        return true; //Array is sorted
    }
    public static void main(String[] args) {
        int[] array1= {1,2, 3, 4, 5};
        int[] array2= {5, 3, 1, 4, 2};

        if (isSorted(array1)) {
            System.out.println("array 1 is sorted. ");
        } else {
            System.out.println("array 1 is not sorted.");
        }
        if (isSorted(array2)) {
            System.out.println("Array 2 is sorted. ");
        } else {
            System.out.println("array 2 is not sorted.");
        }

    }
}
