package conditionalStatement;

import java.util.Scanner;

public class leepyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0)
        {
            if (year%100==0)     //Nested Ifelse
            {
                if (year%400==0)
                {
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a Leap Year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("Not a leap Year");
        }
    }
}
