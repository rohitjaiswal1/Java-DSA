package Function_and_Method;

import java.util.Scanner;

public class averageOfThreeNo {
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = sc.nextDouble();
        System.out.println("Input the second number: ");
        double y = sc.nextDouble();
        System.out.println("Input the second number: ");
        double z = sc.nextDouble();
        System.out.print("the average value is " + average(x, y, z)+"\n");
    }
}
