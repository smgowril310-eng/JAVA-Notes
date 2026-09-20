//Hashtable:
/**A Hashtable is a class in java that stores data in key-value pairs
 * It belongs to the java.util package and implements the Map interface
 * Hashtable methods are synchronized
 * null value and null key are not allowed
 * It doesn't maintain the insertion order
 * It performance is very slow
 * Hashtable(array+linkedlist)
 * It default capacity is 11 
 */

import java.util.Hashtable;
public class HashtableEx {
  public static void main(String[] args) {
    Hashtable<Integer,String> h=new Hashtable<>();
    h.put(1,"Gowri");
    h.put(2,"Priya");
    h.put(3,"Kavi");
    System.out.println(h);
  }  
}
