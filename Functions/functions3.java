package Functions;

import java.util.Scanner;
//Call by Value     Call by Reference
public class functions3 {
    public static void swap(int a, int b) {
       //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("a = " +b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        swap(a, b);



    }
}
