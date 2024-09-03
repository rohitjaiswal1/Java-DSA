package Functions;

import java.util.Scanner;
// there are two types of parameter, formal and actual parameter
public class function2_1 {
    public static int calculateSum(int num1, int num2) { //parameters or formal parameter
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguments or actual parameter
        System.out.println("Sum is : " + sum);
    }
}
