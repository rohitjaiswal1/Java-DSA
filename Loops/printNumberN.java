package Loops;

import java.util.Scanner;

public class printNumberN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (x <= n) {
            System.out.println(x);
            x++;
        }
    }
}
