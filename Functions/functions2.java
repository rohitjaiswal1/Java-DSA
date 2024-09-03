package Functions;

import java.util.Scanner;
//there are two types of parameter formal and actual parameter
public class functions2 {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }
    public static void main(String[] args) {
        calculate();

    }
}
