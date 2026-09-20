//ConcurrentHashMap:
/**ConcurrentHashMap is a class in Java that stores data in key-value pairs and supports thread-safe operations when multiple threads access the map concurrently.

It belongs to the java.util.concurrent package.
Each Bucket is synchronized
 * null value and null key are not allowed
 * It doesn't maintain the insertion order
 * It performance is very fast
 * Hashtable(array+linkedlist)
 * It default capacity is 16 
 */

 import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapEx {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map =
                new ConcurrentHashMap<>();

        map.put(1, "Gowri");
        map.put(2, "Priya");
        map.put(3, "Kavi");

        System.out.println(map);
    }
}