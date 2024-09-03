package VariableAndDataType;

/*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.Scanner;

public class averageOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inter first value");
        int a = sc.nextInt();

        System.out.println("inter second value");
        int b = sc.nextInt();

        System.out.println("inter third value");
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.println(" Average is : " +average);
    }
}
