//Queue:
/**Queue is used when we want to store and process objects in a particular order
Duplicate values → Allowed
Insertion order → Maintained
FIFO → First In, First Out
First element → Removed first */

//PriorityQueue:
/**PriorityQueue is used when we want to process elements based on their priority instead of insertion order.

Duplicate values → Allowed
Insertion order → Not Maintained
Priority order → Maintained
Index → Not Available
null → Not Allowed
Size → Dynamic
Default priority → Smallest element first

Methods:
add()      → Add element
offer()    → Add element
poll()     → Remove highest-priority element
peek()     → View highest-priority element
remove()   → Remove element
isEmpty()  → Check whether queue is empty
size()     → Number of elements*/
// import java.util.PriorityQueue;
// public class Queue {
//     public static void main(String[] args) {

//         PriorityQueue<Integer> numbers = new PriorityQueue<>();

//         numbers.add(50);
//         numbers.add(10);
//         numbers.add(30);
//         numbers.offer(20);

//         System.out.println(numbers);

//         System.out.println(numbers.poll());
//         System.out.println(numbers.poll());
//         System.out.println(numbers.peek());
//         System.out.println(numbers.remove(50));
//         System.out.println(numbers.isEmpty());
//         System.out.println(numbers.size());
//     }
// }

//Deque:
/**Deque(Double Ended queue) is used when we want to add and remove elements from both ends-front and rear
 * Full form->Double Ended Queue
 * Insertion->Both ends
 * Deletion->Both ends
 * Duplicate values->Allowed
 * Index->Not Available
 * null->Depends on implementation;ArrayDeque does not allow null
 * Main implementations->ArrayDeque,LinkedList
 */

//  import java.util.ArrayDeque;
//  import java.util.Deque;
//  public class Queue {
//  public static void main(String[] args) {
//     Deque<String> d=new ArrayDeque<>();
//     d.addFirst("Gowri");
//     d.addLast("Priya");
//     d.addLast("Ram");
//     System.out.println(d);
//     d.removeFirst();
//     d.removeLast();
//     System.out.println(d);
//  }  
//  }
    
//ArrayDeque:
/**ArrayDeque is a resizable array implementation of the Deque interface
 * It allows insertion and deletion from both ends-font and rear
 * full form->Array Double Ended Queue
 * Insertion->Both ends
 * Delection->Both ends
 * Duplicate values->Allowed
 * Insertion order->Maintained
 * Index ->Not Available
 * null->Not Allowed
 * size->Dynamic
 */
import java.util.ArrayDeque;
 public class Queue {
 public static void main(String[] args) {
    ArrayDeque<String> d =new ArrayDeque<>();
    d.addFirst("Gowri");
    d.addLast("Priya");
    d.addLast("Ram");
    System.out.println(d);
    System.out.println(d.peekFirst());
    System.out.println(d.peekLast());
    d.removeFirst();
    System.out.println(d);
    d.removeLast();
    System.out.println(d);
 }
    
 }


