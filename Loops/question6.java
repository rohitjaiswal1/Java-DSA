package Loops;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number_of_line = 1;
        int osp = n - 1;
        int isp = n - 2;
        while (number_of_line<=n){
            if (number_of_line == 1 || number_of_line ==n){
                for (int i=0; i<osp; i++){
                    System.out.print("  ");
                }
                for (int i=0; i<n; i++){
                    System.out.print("* ");
                }
            } else {
                //print outer spaces
                for (int i=0; i<osp; i++){
                    System.out.print("  ");
                }

                // print stars
                System.out.print("* ");

                // print inner spaces
                for (int i=0; i<isp; i++){
                    System.out.print("  ");
                }
                // print star
                System.out.print("* ");
            }
            System.out.println();
            osp--;
            number_of_line++;
        }
    }
}
