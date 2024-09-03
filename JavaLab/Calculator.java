package JavaLab;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x, y, sum, mul, division, subs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        x=sc.nextInt();
        System.out.println("Type another number");
        y=sc.nextInt();
        sum =x+y;
        System.out.println("Sum is : " +sum);
        mul =x*y;
        System.out.println("Multiply is :" +mul);
        division = x/y;
        System.out.println("Division is :" +division);
        subs =x-y;
        System.out.println("Substraction is :" +subs);
    }
}
