package Patterns_advance;

public class inverted_half_pyramid_pattern_with_number {

    public static void inverted_pyramid_num(int n) {
        for (int i = 1; i <= n; i++) {
            //inner - number
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
        inverted_pyramid_num(5);
    }
}
