//Map:
/**Map is an interface in Java used to store data in the form of key-value pairs.
 * The Key doesnot allow duplicate 
 * The value allow duplicate
 * The Key and value both are allow null
 */

 //HashMap:
 /**HashMap is a class in Java used to store data in the form of key-value pairs.
  * It does not maintain insertion order.
  * It default capacity is 16
  */
// import java.util.HashMap;
// import java.util.Map.Entry;
// public class Map {
//   public static void main(String[] args) {
//     HashMap<Integer,String> m=new HashMap<>();
//     m.put(2, "A");
//     m.put(4,null);
//     m.put(null,"C");
//     m.put(5,"D");
//     m.put(2,"E");
//     System.out.println(m);
//     m.putIfAbsent(5,"F");//that adds a key-value pair only if the key is not already present
//     System.out.println(m);
//     System.out.println(m.containsKey(null));
//     System.out.println(m.containsValue("B"));
//     System.out.println(m.get(2));
//     m.remove(2);
//     System.out.println(m);
//     System.out.println(m.entrySet());
//     System.out.println(m.values());
//     System.out.println(m.keySet());
//     for(Entry<Integer,String>e:m.entrySet()){
//       System.out.println(e);
//       System.out.println(e.getKey());
//       System.out.println(e.getValue());
//     }
//   }  

// }

//Linked Hashmap:
/**LinkedHashMap is a class in java that stores key value pairs and maintains insertion order
 * It is default capacity 16
 */
// import java.util.LinkedHashMap;
// public class Map{
// public static void main(String[]args){
//   LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
//   students.put(101,"Gowri");
//   students.put(102,"Priya");
//   students.put(103,"Arun");
//   System.out.println("Students:"+students);
//   students.put(102,"Kavi");
//   System.out.println("After update:"+students);
// }
// }

//Sorted Map:
/**Sorted Map is an interface in java that stores key value pairs in sorted order based on keys */

//TreeMap:
/**TreeMap is a class in java that stores key value pairs in sorted order based on keys
 * It is subclass of sorted Map interface
 * It datastructure Red black tree
 * Key object should implements comparable interface
 * Custom sorting also possible
 * null key is not allowed 
 * null value is allowed
 * It is no default capacity
 */

 import java.util.TreeMap;
 public class Map{
  public static void main(String[]args){
    TreeMap<Integer,String> s=new TreeMap<>();
    s.put(103,"Arun");
    s.put(101,"Gowri");
    s.put(102,"priya");
    s.put(104,"Kavi");
    System.out.println("students:"+s);
    System.out.println("First key:"+s.firstKey());
    System.out.println("Last Key:"+s.lastKey());
  }
 }