//Set:
/**Set is used when we want to store uniqe objects
 * Duplicate values->Not Allowed
 * Insertion order->Depends on implementation
 * Index->Not Available
 * Unique values->Maintained
 * null->Depends on implementation
 * 
 * HashSet:
 * HashSet is Used when we want to store unique objects without duplicates
 * It is store both homo and hetro type of objects
 * It doesnot allowed index based methods like add(index,element),addAll(index,Collection),set(index,element)and indexOf()
 * It does not support for loop
 * It does not support list iterator
 * Duplicates values->Not Allowed
 * Insertion oreder->Not Maintained
 * Index->Not Available
 * Unique values->Maintained
 * null->One null value allowed
 * Size->Dynamic
 * Default capacity->16
 */
//HashSet
// import java.util.HashSet;
// import java.util.Iterator;
// public class Set {
//     public static void main(String[] args) {
//         HashSet<Integer> h=new HashSet<>();
//         h.add(20);
//         h.add(30);
//         h.add(10);
//         h.add(12);
//         h.add(20);
//         h.add(100);
//         System.out.println(h);
//         for(Integer a:h){
//             System.out.println(a);
//         }
//         Iterator<Integer> l=h.iterator();
//         while (l.hasNext()) {
//             System.out.println(l.next());
//         }
//         System.out.println(h.contains(10));
//         h.clear();
//         System.out.println(h);
//     }
    
// }

//LinkedHashSet:
/**LinkedHashSet is used when we want to store unique objects and maintain insertion order
 * It does not support for loop
 * It does not allowed index based methods
 * It datastructure is doublylinkedlist+hashtable
 * It doest not support listIterator
 * It store both homo and hetro type of object
 * Duplicate values ->Not Allowed
 * Insertion order->Maintained
 * Index->Not Available
 * Unique values->Maintained
 * null values->One null value allowed
 * size->Dynamic
 * Default capacity->16
 */

//  import java.util.LinkedHashSet;
//  public class Set {
//  public static void main(String[] args) {
//     LinkedHashSet<Integer> l=new LinkedHashSet<>();
//     l.add(20);
//     l.add(10);
//     l.add(40);
//     l.add(30);
//     l.add(20);
//     System.out.println(l.getLast());
//     System.out.println(l);
//     l.clear();
//     System.out.println(l);
//  }
    
//  }

//SortedSet:
/**SortedSet is an interface used when we want to store unique objects in sorted order
 * Duplicate values->Not Allowed
 * Sorted order->Maintained
 * Insertion order->Not Maintained
 * Index->Not Available
 * null->Generally not allowed with natural ordering
 * size->Dynamic
 * Main implementation->Treeset
 */
//TreeSet:
/**TreeSet is used when we want to store unique objects in sorted order
 * It doest not allowed Index based methods
 * It store only homogeneous object
 * wrapper class implements comparable(compareTo())
 * Duplicate values->Not Allowed
 * Sorted order->Maintained
 * Insertion order->Not Maintained
 * Index->Not Available
 * null->Generally not allowed 
 * size->Dynamic
 * implements->NavigableSet/SortedSet
 * No default capacity
 * 
 */

 import java.util.TreeSet;
 public class Set {
 public static void main(String[] args) {
    TreeSet<Integer>t=new TreeSet<>();
    t.add(20);
    t.add(10);
    t.add(30);
    t.add(25);
    t.add(40);
    t.add(40);
    System.out.println(t);
 }
    
 }