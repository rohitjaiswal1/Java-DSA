package Loops;
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class integers {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element: ");
        int n = sc.nextInt();

        System.out.println("Enter the element:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " +oddSum);

    }
}
