package Array;

public class array3 {
//Linear Search
    public static int linearSearch(int number[], int key) {
        for (int i=0; i<number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 12, 14, 16};
        int key = 12;

        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index :" +index);
        }

    }
}
