package Functions;

public class function16 {
    /*READ & CODE EXERCISE
    Search about(Google) & use the following methods of the Math class in Java:
            a. Math.min( )
            b. Math.max( )
            c. Math.sqrt( )
            d. Math.pow( )
            e. Math.avg( )
            f. Math.abs( ) */
    public static void main(String[] args) {
        double smaller = Math.min(5.6, 3.2);
        double larger = Math.max(5.6, 3.2);
        double squareRoot = Math.sqrt(25.0);
        double result = Math.pow(2.0, 3.0);
        double absoluteValue = Math.abs(-5.6);

        System.out.println("Smaller: " + smaller);
        System.out.println("Larger: " + larger);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power Result: " + result);
        System.out.println("Absolute Value: " + absoluteValue);
    }
}
