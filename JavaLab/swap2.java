package JavaLab;
//write a program to swap number.
import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, t;
        System.out.println("Enter 1st no");
        x = sc.nextInt();
        System.out.println("Enter 2nd no");
        y = sc.nextInt();
        t = x;
        x=y;
        y=t;
        System.out.println("Number agter swapping : " +x + " " +y);
    }
}
