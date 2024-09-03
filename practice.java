import java.util.HashMap;

/**
 * practice
 */
public class practice {
    static void HashMapMethod(){
        //syntex
        HashMap<String, Integer> mp = new HashMap<>();
        //adding element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 18);
        mp.put("Harry", 18);
        //getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null

        //changing/updating value of a key in the HashMap
        mp.put("Akash", 25); // Akash --> 25
        System.out.println(mp.get("Akash"));  // 25

        //removing a pair from the HashMap
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("riya")); //null

        //checking if a key in the hashMap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true

        //Adding a new entry only if the new key does't exist already
        mp.putIfAbsent("Yashika", 30); //will enter
        mp.putIfAbsent("Yash", 30); //will not enter

        //get all key in the Hashmap
        System.out.println(mp.keySet());

        //get all value in the Hashmap
        System.out.println(mp.values());

        //get all entries in the hashmap
        System.out.println(mp.entrySet());
        
    }

    public static void main(String[] args) {
        HashMapMethod();
       
    }
}