import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        //Program 1
        //Write a Java program to get a number from the user and print whether it is positive or negative
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//
//        if(number>0) {
//            System.out.println("Number is positive");
//        } else if (number<0) {
//            System.out.println("Number is negative");
//        }
//        else {
//            System.out.println("Number is zero");
//        }
         //Program 2
        //Write a Java program that takes three numbers from the user and prints the greatest number
//        int n1,n2,n3;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the number 1");
//        n1 = sc.nextInt();
//        System.out.println("Enter the number 2");
//        n2 = sc.nextInt();
//        System.out.println("Enter the number 3");
//        n3 = sc.nextInt();
//        if (n1>n2 && n1>n3)
//            System.out.println("The greatest:"+n1);
//        if (n2>n1 && n2>n3)
//            System.out.println("The greatest:"+n2);
//        if (n3>n2 && n3>n1)
//            System.out.println("The greatest:"+n3);

        //Program 3
        /*Write a Java program that takes a number from the user and generates an integer between 1 and 7. It
        displays the weekday name.*/
//        int day;
//        System.out.println("Enter Your Number");
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid Input");
//
//
//        }
        //Program 4
        //Write a Java program to find the number of days in a month.c =
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter month");
//        int month= sc.nextInt();
//
//
//        if(month==1) {
//            System.out.println("31");
//        } else if (month==2) {
//            System.out.println("28/29");
//        } else if (month==3) {
//            System.out.println("31");
//        } else if (month==4) {
//            System.out.println("30");
//        } else if (month==5) {
//            System.out.println("31");
//        } else if (month==6) {
//            System.out.println("30");
//        } else if (month==7) {
//            System.out.println("31");
//        } else if (month==8) {
//            System.out.println("31");
//        } else if (month==9) {
//            System.out.println("30");
//        } else if (month==10) {
//            System.out.println("31");
//        } else if (month==11) {
//            System.out.println("30");
//        } else if (month==12) {
//            System.out.println("31");
//        }

             //Program 5
        /*Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel
        or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is
        a string of length > 1, print an error message.*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input a character:");
//        String str=sc.next();
//        char ch=str.charAt(0);
//        if (ch=='e' || ch=='a' ||ch=='i' || ch=='o' || ch=='u'){
//            System.out.println("this is a vowel");
//        }
//        else{
//            System.out.println("this is constant");
//        }
       // Program 6
        /*Write a Java program that takes a year from the user and prints whether it is a leap year or not.*/
//        while(true) {
//            System.out.println("enter the year");
//            Scanner st = new Scanner(System.in);
//            int year = st.nextInt();
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println("this is a leap year");
//            } else {
//                System.out.println("this is not leap year");
//            }
//        }
        //Program 7
        /* Write a program to check whether a number is divisible by 5 and 11 or not*/
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//
//        if (number % 5 == 0 && number % 11 == 0) {
//            System.out.println(number + "is divisible by both 5 and 11.");
//        } else {
//            System.out.println(number +"is not divisible by both 5 and 11");
//        }

    }
}
