package HashMap;

import java.util.HashSet;
//hashset me duplicate print nahi hota hai.
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
    }
}
