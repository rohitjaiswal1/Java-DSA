package Function_and_Method;

public class product_a_and_b {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a =3;
        int b =5;
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
    }
}
