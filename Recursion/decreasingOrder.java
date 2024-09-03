package Recursion;


import java.util.Scanner;

public class decreasingOrder {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printNumbers(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printNumbers(n);

    }

}
