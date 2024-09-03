package TwoD_Arrays;
       /* Print the number of 7’s that are in the 2d array.
        Example :
        Input - int[][] array = { {4,7,8},{8,8,7} };
        Output - 2 */
public class question1 {
    public static void main(String[] args) {
        int[][] array = {{4, 7, 8}, {8, 8, 7}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j <array[i].length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("The number of 7's in the array is " + count);
    }
}
