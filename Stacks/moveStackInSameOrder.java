package Stacks;
// Copy/move content of one stack to another in same order.
import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the element : ");
        for (int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
