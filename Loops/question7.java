package Loops;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number_of_line = 1;
        int sp = n-1;
        int st = 1;

        while (number_of_line<=n){
            // print spaces
            for (int i=0; i<sp; i++){
                System.out.print("  ");
            }

            // print stars
            for (int i=0; i<st; i++){
                System.out.print(number_of_line+"  ");
            }

            // next line
            System.out.println();
            sp--;
            st++;
            number_of_line++;
        }
    }
}
