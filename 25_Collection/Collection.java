//Collection:
/**Collection in Java is a framework used to store and manage a group of objects
 * It is a interface
 * It is store both homogeneous and hetrogeneous objects
 * Size is growable
 * It can store only objects
 * Map is also an important part of the Collections Framework,but technically Map does not extend Collection
 * 
 * Iterable->Collection
 *               |
 *     1.List:
 *       ArrayList
 *       LinkedList
 *       Vector->Stack
 * 
 *     2.Queue:
 *       PriorityQueue
 *       Deque->ArrayDequeue
 * 
 *     3.Set:
 *       HashSet
 *       LinkedHashSet
 *       SortedSet->TreeSet
 * 
 * //Framework:
 * It represents the collection of classes and interfaces
 * It is a readymade architecture
 * 
 * //Types of Object:
 * 1.Homogeneous object:
 * Similar type of objects stored in single collection object
 * Ex:ArrayList<Integer> a1=new ArrayList<>();
 * 
 * 2.Hetrogeneous object:
 * Different type of objects stored in a single collection object
 * Ex:ArrayList a1=new ArrayList();
 */
import java.util.*;
public class Collection {
  public static void main(String[] args) {
     //Homogeneous object:
    // LinkedList<String> list =new LinkedList<>();
    // list.add("Gowri");
    // list.add("Sahi");
    // System.out.println(list);

    //Hetrogeneous object:
    ArrayList<Object> data=new ArrayList<Object>();
    data.add("Gowri");
    data.add(21);
    System.out.println(data);
  }  
}
