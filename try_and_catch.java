public class try_and_catch {
    public static void main(String[] args) {

        int a=5, b=0, c;
        try {
            c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block");
        }
    }
}
