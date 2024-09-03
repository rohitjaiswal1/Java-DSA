import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        //Program 1
        /*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number*/
//        System.out.println("Enter a positive integer: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num <=0) {
//            System.out.println("Please enter a positive integer.");
//        } else {
//            System.out.println("Multiplication Table of " + num);
//            for (int i = 1; i<= 10; i++) {
//                int product = num * i;
//                //System.out.println(num +"x" + i + "=" + product);
//                System.out.println(product);
//            }
//        }
        //Program 2
        //Write a java program to find the factorial value of any number entered through the keyboard

//        int n;
//        int fact=1;
//          System.out.println("Enter any Number ");
//          Scanner sc=new Scanner(System.in);
//          n = sc.nextInt();
//
//        for (int i=1; i<=n; i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println("factorial "+fact);

                //or
//        int n;
//        int fact=1;
//        System.out.println("enter any number");
//        Scanner sc=new Scanner(System.in);
//        n = sc.nextInt();
//        int i=1;
//        while(i<=n) {
//            fact = fact * i;
//            System.out.println("factorial" + fact);
//            i++;
//        }

          //Program 3
        /*Two numbers are entered through the keyboard. Write a java program to find the
        value of one number raised to the power of another. (Do not use Java built-in method)*/


//        int n, p ,result =1;
//        System.out.println("Enter No.");
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//        System.out.println("Enter Power");
//        p=sc.nextInt();
//
//        for (int i=1; i<=p; i++)
//        {
//            result = n*result;
//        }
//        System.out.println("Power" +result);
           //Program 4
        /*Write a java program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321*/

//            int n, r;
//            System.out.println("Enter any Number ");
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//
//            while (n > 0) {
//                r = n % 10;
//                System.out.print(r);
//                n = n / 10;
//            }

        //Program 5
        /*Write a program that prompts the user to input a positive integer. It should then output a message indicati
ng whether the number is a prime number*/

//        while (true) {
//            int n, count = 0;
//            System.out.println("Enter any Number ");
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0) {
//                    count++;
//                }
//            }
//            if (count == 2)
//                System.out.println("Prime Number");
//            else
//                System.out.println("Not Prime Number");
//        }
        //Program 6
        /*Write a java program to calculate HCF of Two given number*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two number");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int hcf=1;
//        for (int i=1;i<=num1;i++) {
//            if (num1%i==0 && num2%i==0)
//                hcf=i;
//        }
//        System.out.println("HCF is: "+hcf);
        //or
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two number");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int hcf=1;
//        int min=(num1>num2)?num2:num1;
//        for (int i=1;i<=min;i++) {
//            if (num1%i==0 && num2%i==0)
//                hcf=i;
//        }
//        System.out.println("HCF is: "+hcf);

        //Program 7
//        /*Write a java program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered*/
//        while(true) {
//            int num;
//            System.out.println("Enter the number");
//            Scanner sc = new Scanner(System.in);
//            num = sc.nextInt();
//            if (num > 0) {
//                System.out.println("positive");
//            } else if (num < 0) {
//                System.out.println("negative");
//            } else {
//                System.out.println("zero");
//            }
//        }

        //Program 8
       /* Write a java program to print the multiplication table of a number N, entered by the
        use*/
//        System.out.println("Enter a positive integer: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 1; i<= 10; i++) {
//            int product = num * i;
//            System.out.println(product);
//        }

        }
    }
