package JavaLab;
//program to find greater in 3 numbers.
import java.util.Scanner;

public class gratestIn3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b =sc.nextInt();
        System.out.println("Enter 3rd nubmer");
        c = sc.nextInt();

        if ((a>b) && (a>c)){
            System.out.println("Greatest number is :"+a);
        } else if ((b>a) && (b>c)) {
            System.out.println("Greatest number is :"+b);
        }
        else {
            System.out.println("Greatest number is :"+c);
        }
    }
}
