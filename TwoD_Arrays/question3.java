package TwoD_Arrays;
/*Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns.
        For a 2x3 matrix,
        Matrix
        a11    a12    a13
        a21    a22    a23
        Transposed Matrix
        a11    a21 a12
        a22a13    a23 */
public class question3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {2, 4, 6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }
}
