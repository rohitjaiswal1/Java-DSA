package Functions;

import java.util.Scanner;
// Write a Java method to compute the average of three numbers.
public class function13 {
    public static void calAvg() {
        float a,  b, c, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter 3 number :");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        avg = (a+b+c) / 3;
        System.out.println("\n Average = " +avg);


    }
    public static void main(String[] args) {

        calAvg();
    }


}
