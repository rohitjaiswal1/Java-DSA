package Patterns_advance;

public class solid_Rombos {
    public static void solid_rom(int n) {
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rom(5);
    }
}
