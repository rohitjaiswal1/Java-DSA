package Function_and_Method;

import java.util.Scanner;

public class sum {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
    public static void main(String[] args) {
        calculate();
    }
}
