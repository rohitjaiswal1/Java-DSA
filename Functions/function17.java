package Functions;

import java.util.Scanner;
/*Write a Java method to compute the sum of the digits in an integer.
        (Hint : Approach this queson in the following way :
        a. Take a variable sum = 0
        b. Find the last digit of the number
        c. Add it to the sum
        d. Repeat a & b unl the number becomes 0 )*/

public class function17 {
    public  static int sum() {
        int n,r,sum=0;
        System.out.println("enter any number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>0) {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of digits " +sum());
    }
}
