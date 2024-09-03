public class pattern {

    public static void numberPyramid(int n) {
        //outer loop

        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-1;j++) {
                System.out.print(" ");
            }

            //numbers
            for (int j=1; j<=i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //diamond(7);
        numberPyramid(5);
    }
}
