//IdentityHashMap:
/**IdentityHashMap is a special implementation of the Map interface in Java.
It compares keys using reference equality (==) instead of object equality (equals()).
Null keys and null values are allowed. 
Order is not maintained.
It dataStructure is flat array */

import java.util.IdentityHashMap;

public class IdentityHashMapEx {
    public static void main(String[] args) {

        IdentityHashMap<String, Integer> map =
                new IdentityHashMap<>();

        String a = new String("Java");
        String b = new String("Java");

        map.put(a, 100);
        map.put(b, 200);

        System.out.println(map);
    }
}