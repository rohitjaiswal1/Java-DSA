package Functions;

import Functions.function9;

public class functions10 {

    public static void primeinRange(int n) {
        for (int i=2; i<=n; i++) {
            if (function9.isPrime(i)) {
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeinRange(20);
    }
}
