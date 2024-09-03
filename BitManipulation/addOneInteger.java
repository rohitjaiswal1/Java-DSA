package BitManipulation;

public class addOneInteger {
    public static void main(String[] args) {
        int num = 5;

        // Add 1 to num using bit manipulation
        num = -~num;

        System.out.println("After adding 1:");
        System.out.println("num = " + num);
    }
}
