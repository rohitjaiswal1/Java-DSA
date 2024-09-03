public class testThrow {

    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
    public static void main(String[] args) {
        testThrow obj = new testThrow();
        checkNum(-3);
        System.out.println("rest the number");

    }
}
