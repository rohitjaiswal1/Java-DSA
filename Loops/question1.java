package Loops;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = 1;
        int sp = n - 1;

//        for (int i=0; i<n; i++){
//            //print stars
//            for (int j=0; j<st; j++){
//                System.out.print("*");
//            }
//
//            //print spaces
//            for (int j=0; j<sp; j++){
//                System.out.print(" ");
//            }
//
//            //prepare for next line
//            System.out.println();
//            st++;
//            sp--;
 //       }

        //or

        int number_of_line = 1;

        while (number_of_line<=n){
            // print stars
            for (int j=0; j<st; j++){
                System.out.print("*");
            }

            // print spaces
            for (int j=0; j<sp; j++){
                System.out.print(" ");
            }

            // prepare for spaces
            System.out.println();
                st++;
                sp--;
                number_of_line++;
            }
        }
    }

