package JavaLab;
//write a program in java to check weather the person is eligible for vote or note.
import java.util.Scanner;

public class forVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the age");
        a = sc.nextInt();

        if (a>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}

