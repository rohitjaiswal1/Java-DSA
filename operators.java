import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
       //problem 1
       /* Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area an
        d perimeter of the rectangle */
//        int len = 5,breath = 7;
//        System.out.println("Area of rect is :" +len*breath);
//        System.out.println("Perimeter is :" +2*(len+breath));

        //problem 2
       /* Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotie
        nt is taken with 5 and then multiply the resultant value by 5. Display the final result */

//        int number = 2345;
//        number += 8;
//        number /= 3;
//        number %= 5;
//        number *= 5;
//        System.out.println("The final result is " + number + ".");
              //or
       // System.out.println(((8+2345)/3)%5);

       //program 3
       // Write a program to check if the two numbers 23 and 45 are equal
        /*int number1 = 23;
        int number2 = 24;

        if (number1 == number2) {
            System.out.println("The number are equal.");
        } else {
            System.out.println("The number are not equal.");
        } */
             //or
//        System.out.println("if 23 and 24 are equal" +(23==24));
        //program 4
       /* Assign values of variables ’a’ and ’b’ as 55 and 70 respectively and then check if both the conditions ’a <
                50’ and ’a < b’ are true */
//        int a = 55;
//        int b = 70;
//
//        if (a < 50 && a <b) {
//            System.out.println("Both the condition are true.");
//        } else {
//            System.out.println("At least one of the condition is false.");
//        }
//        or
//        int a =55,b = 70,c=0;
//        System.out.println(a<50&&a<b);

        //program 5
        /*Suppose the values of variables ’a’ and ’b’ are 6 and 8 respecrtively, write two programs to swap the valu
es of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10
then after swapping the value of x and y should become 10 and 5 respectively.) */
//s
//      int a = 6;
//      int b = 8;
//      //Swapping using a third variable
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swapping (using third variable):");
//        System.out.println("a = " +a);
//        System.out.println("b = " +b);
//
//        //Swapping without using a third variable
//
//        a = a + b;   //(6+8)=14|a=14
//        b = a - b;   //(14-8)=6|b=6
//        a = a - b;   //(14-6)=8|a=8
//        System.out.println("After swapping (without using third variable):");
//        System.out.println("a = " +a);
//        System.out.println("b = " +b);

             //program 6
        //Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231

//        int num = 132;
//        int fd = (num/100);
//        int md = (num%100)/10;
//        int ld = (num%10);
//        System.out.printf("%d%d%d",ld,md,fd);
            //or
//      Scanner sc=new Scanner(System.in);
//      int num;
//      System.out.println("Enter any three digit number");
//      num = sc.nextInt();
//      int fd = (num/100);
//      int md = (num%100)/10;
//      int ld = (num%10);
//      System.out.printf("%d%d%d",ld,md,fd);

        //program 7
        /*Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the correspon
        ding digits of the number TAKEN.
        For example, if the number which was taken is 5696, then the displayed number should be 7818*/

//        int num = 5696;
//        int fd = (num/1000)+2;
//        int sd = (num%1000)/100+2;
//        int td2 = (num%100)/10+2;
//        int td = (td2%10);
//        int ld = (num%10)+2;
//        System.out.printf("%d%d%d%d",fd,sd,td,ld);

    }

}
