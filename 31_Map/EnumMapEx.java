//EnumMap:
/**EnumMap is a specialized Map implementation in Java that stores key-value pairs where the keys are of an enum type.

It belongs to the java.util package.
It maintains order
It Datastructure is Array
Null key is not allowed
null value is allowed */

import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumMapEx
 {
    public static void main(String[] args) {

        EnumMap<Day, String> map =
                new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Java");
        map.put(Day.TUESDAY, "Spring");
        map.put(Day.WEDNESDAY, "SQL");

        System.out.println(map);
    }
}