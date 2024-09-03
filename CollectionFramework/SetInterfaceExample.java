package CollectionFramework;

import java.util.HashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); // 1,2,3
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); // 1,2,3
        st.remove(2);
        System.out.println(2); // false
        System.out.println(st.size()); // 2
    }
}
