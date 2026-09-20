//WeakHashMap:
/**WeakHashMap is a class in Java that stores data in key-value pairs. Its main feature is that it uses weak references for keys, allowing entries to be removed by the Garbage Collector when keys are no longer strongly referenced.
 * It null key(one) and null values are allowed
 * order is not maintained
 * performance is very high(auto cleans)
 */

 import java.util.WeakHashMap;

public class WeakHashmapEx {
    public static void main(String[] args) {

        WeakHashMap<Object, String> map =
                new WeakHashMap<>();

        Object key = new Object();

        map.put(key, "Java");

        System.out.println("Before: " + map);

        key = null;

        System.gc();

        System.out.println("After: " + map);
    }
}