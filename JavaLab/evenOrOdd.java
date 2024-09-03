package JavaLab;
//program to check whther the given number is even or odd.
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the no.");
        a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.println("No. is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
