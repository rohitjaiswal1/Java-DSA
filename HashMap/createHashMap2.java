package HashMap;

import java.util.HashMap;

public class createHashMap2 {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

       // insert - 0(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

//        //Get - 0(1)
//
//        int population = hm.get("India");
//        System.out.println(population);
//               //or
//        //System.out.println(hm.get("India"));
//
//        System.out.println(hm.get("Indonesia")); //key exist nahi karti isiliye null value return karegi.
//
//        //ContainsKey - 0(1)
//        System.out.println(hm.containsKey("India")); //true
//        System.out.println(hm.containsKey("Indonesia")); //false

        //Remove - 0(1)
//        System.out.println(hm.remove("China"));
//        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is empty
        System.out.println(hm.isEmpty()); // empty nahi hai
    }
}
