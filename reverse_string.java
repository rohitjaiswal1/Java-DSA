public class reverse_string {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("hello");
//
//        for (int i=0; i<sb.length()/2; i++) {
//            int front = i;
//            int back = sb.length() - 1 - i;
//
//            char frontChar = sb.charAt(front);
//            char backChar = sb.charAt(back);
//
//            sb.setCharAt(front, backChar);
//            sb.setCharAt(back, frontChar);
//        }
//
//        System.out.println(sb);

        //or
        String hello="Hello";
        String reverseHello = new StringBuilder(hello).reverse().toString();
        System.out.println(reverseHello);
    }
}
