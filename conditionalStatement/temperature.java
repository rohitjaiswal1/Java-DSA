package conditionalStatement;
// finish the following code so that it prints you have a fever if your temperature is above 100 and otherwise prints you don't have a fever.
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        //double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("you don't have a fever");
        }
    }
}
