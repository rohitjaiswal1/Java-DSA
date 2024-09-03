public class testThrows {

    public static int divideNum(int m, int n) {
        int div = m / n;
        return div;
    }
    public static void main(String[] args) {
        testThrows obj = new testThrows();
        try {
            System.out.println(divideNum(45,0));
        }
        catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }
    }
}
