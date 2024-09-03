package JavaLab;
/*Write a program that calculates how long it takes to drive from New York to Los Angeles at 75 mile per hour
 (Use 3000 miles as the approximate distance between two cities).*/

public class DriveTimeCalculator {
    public static void main(String[] args) {
        int distance = 3000;
        int speed = 75;
        int time = distance/speed;
        System.out.println("The time required between two cities:" +time+ "hours");
    }
}
