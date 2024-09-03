package JavaLab;
//program to find the factorial of the number.
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, fact = 1;
        System.out.println("Enter the number");
        x = sc.nextInt();
        for (int i=1; i<=x; i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of the no is :"+ fact);
    }
}
