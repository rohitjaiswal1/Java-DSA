package Functions;

public class functions4 {
    //Find Product of a & b
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("a * b = " + a * b);
        //multiply(a, b); //or
        int multiply = multiply(a, b);

    }
}
