package Loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of " + n);

        for (int i=1;i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
