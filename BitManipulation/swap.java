package BitManipulation;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swapping without using a third variable
        a = a + b;  //15
        b = a - b; // 15-10=5
        a = a - b; // 15 - 5 = 10

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
