package conditionalStatement;
//Print the largest of 3
public class printlargestof3no {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("largest is A");
        } else if (B >= C) {
            System.out.println("Largest is B");
        }
        else {
            System.out.println("Largest is C");
        }
    }
}
