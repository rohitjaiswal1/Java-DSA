package HashMap;
// Create a hashmap using Java HashMap class to store the following pairs(Person,Age)and display them.
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class createHashMap {
    static void HashMapMethod(){
        //Syntex
        HashMap<String, Integer> mp = new HashMap<>();
        //Adding Element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        //Changing/updating value of a key in the HashMap
        mp.put("Akash", 25); // Akash --> 25
        System.out.println(mp.get("Akash")); // 25

        //Removing a pair from the HashMap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("riya")); // null

        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); // will enter
        mp.putIfAbsent("Yash", 30); // will not enter

        //Get all keys in the Hashmap
        System.out.println(mp.keySet());

        //get all value in the Hashmap
        System.out.println(mp.values());

        //Get all entries in the Hashmap
        System.out.println(mp.entrySet());

        //Traversing all entries of Hashmap - multiple method
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        //Or
        System.out.println();
        for (HashMap.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        //Or
        System.out.println();
        for (var e :mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }
    public static void main(String[] args) {
        HashMapMethod();

    }
}
