package JavaLab;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value: ");
        int a = sc.nextInt();
        System.out.println("Enter Second value: ");
        int b = sc.nextInt();


        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
}
