package JavaLab;
/*WAP that describes a class person. It should have instance variables to record name, age and salary.
Create a person object. Set and display its instance variables*/

import java.util.Scanner;

public class Person {
        int age;
        int salary;
        String name;

        void add() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Details");
            System.out.println("Enter Name");
            name=sc.nextLine();
            System.out.println("Enter Age");
            age=sc.nextInt();
            System.out.println("Enter Salary");
            salary=sc.nextInt();
        }
        void Display(){
            System.out.println("Details");
            System.out.println("Name;" +name);
            System.out.println("Age:" +age);
            System.out.println("Salary:" +salary);
        }
    public static void main(String[] args) {
        Person p =new Person();
        p.add();
        p.Display();
    }
}
