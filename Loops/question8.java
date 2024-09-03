package Loops;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number_of_line = 1;
        int sp = n - 1;
        int st = 1;

        while (number_of_line<=n){
            // print spaces
            for (int i=0; i<sp; i++){
                System.out.print("  ");
            }

            // print stars -> replace with numbers
            int current_num = number_of_line;
            for (int i=0; i<st; i++){
                System.out.print(current_num+" ");
                if (i < st/2){
                    current_num--;
                } else {
                    current_num++;
                }
            }

            //next line
            System.out.println();
            sp--;
            st=st+2;
            number_of_line++;
        }
    }
}
