package JavaLab;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a Number");
        x=sc.nextInt();
        System.out.println("Type Another Number");
        y= sc.nextInt();
        sum=x+y;
        System.out.println("Sum is :"+sum);
    }
}
