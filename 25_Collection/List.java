//List:
/**List is used when we want to store objects in order
 * Duplicate values->Allowed
 * Insertion order->Maintained
 * Index->Available
 * null values->Allowed
 * 
 * ArrayList:
 * Arraylist is used when we want to store objects in a dynamic array
 * It can store both homo and hetro types of objects
 * It is also Implements from RandomAccess,cloneable,serializable
 * It is store in a Contineous memory
 * If our frequent operation is insertion or deletion arraylist is not recommended to use
 * If our frequent operation is fetching datas from the object then arraylist is best choice to use
 * Default Capacity->10
 * Duplicate values->allowed
 * Insertion order->Maintained
 * Index->Available
 * Size->Dynamic(can grow/shrink)
 * null values->Allowed
 * 
 */

// import java.util.ArrayList;
// public class List {
//  public static void main(String[] args) {
//     ArrayList<Integer>a1=new ArrayList<>();
//     a1.add(10);
//     a1.add(20);
//     a1.add(20);
//     a1.add(null);
//     a1.add(100);
//     System.out.println(a1);
//     ArrayList<Object> ob=new ArrayList<Object>();
//     ob.add("hello");//add()->Add element
//     ob.add('A');
//     ob.addAll(a1);//addAll()->Add all element
//     System.out.println(ob);
//     // ob.retainAll(a1);
//     // System.out.println(ob);
//     System.out.println(a1.get(4));//get()->Get elemet using index
//     Integer a=a1.get(3);
//     System.out.println(a);
//     Object s=ob.get(0);
//     String s1=(String)ob.get(0);
//     System.out.println(s1);
//     a1.set(1, 33);//set()->Update element
//     System.out.println(a1);
//     a1.remove(3);//remove()->Remove element
//     System.out.println(a1);
//     ob.removeAll(a1);
//     System.out.println(ob);
//     ob.retainAll(a1);//return common value
//     System.out.println(ob);
//     a1.clear();//Remove all elements
//     System.out.println(a1);
//     System.out.println(ob.isEmpty());
//     System.out.println(a1.isEmpty());
//     System.out.println(ob.contains("hello"));//contains()->Check element
//     System.out.println(a1.contains(100));
//     System.out.println(ob.size());//size()->Get number of elements
//  }   
// }

//Linkedlist:
/**Linked list is used when we want to store objects in a sequence and perform frequent insertion and deletion
 * It is not stored in a contineous memory
 * It follows Doubly linkedlist datastructure
 * It is no default capacity
 * If our frequent operation is insertion or deletion linkedlist is best choice to use 
 * If our frequent operation is fetching datas from the object then linkedlist is not recommended to use
 * Duplicate values->allowed
 * Insertion order->Maintained
 * Index->Available
 * size->Dynamic
 * null values->Allowed
 * Insertion/deletion->Easy/faster
 * Random Access->Slowerthan Arraylist
 */

//  import java.util.LinkedList;
//  public class List {
//  public static void main(String[] args) {
//     LinkedList<Integer>l=new LinkedList<>();
//     l.add(10);
//     l.add(20);
//     l.add(40);
//     l.add(10);
//     l.addLast(80);
//     l.add(85);
//     System.out.println(l);
//     l.addFirst(5);
//     System.out.println(l);
//     System.out.println(l.get(3));
//     System.out.println(l.getFirst());
//     System.out.println(l.getLast());
//     l.removeFirst();
//     l.removeLast();
//     System.out.println(l);
//     System.out.println(l.indexOf(40));
//     l.clear();
//     System.out.println(l);
//     System.out.println(l.isEmpty());
//     System.out.println(l.contains(10));
//     LinkedList<Object> a1=new LinkedList<>();
//     a1.add('A');
//     a1.add(10);
//     a1.add("hello");
//     System.out.println(a1);
//     //String s1=(String)a1.get(0);
//     System.out.println(a1);
//  }
    
//  }

//Vector:
/**Vector is a legacy class used to store objects in a dynamic array
 * Duplicate values->Allowed
 * Insertion order->Maintained
 * Index->Available
 * nullvalues->Allowed
 * Thread-safe->yes(synchronized)
 * Performance->Slowerthan ArrayList
 * Datastructure->dynamic array or growable size
 * It can store both homo and hetro type of objects
 * Defaultcapacity->10
 * New Capacity=Oldcapacity*2
 *  */

// import java.util.Vector;
// public class List {
// public static void main(String[] args) {
//  Vector<Object> v=new Vector<Object>();
//  v.addElement(20);   
//  v.add(10);
//  v.addElement(5);
//  v.add(15);
//  v.removeElementAt(0);
//  System.out.println(v);
//  System.out.println(v.capacity());
//  v.add("hi");
//  v.add('a');
//  v.add(100);
//  v.add("hello");
//  v.add(true);
//  v.add(80);
//  v.add("java");
//  System.err.println(v.capacity());
// }
    
// }

//Stack:
/**Stack is used when we want to store objects and process them in LIFO order
 * Stack is sub of vector
 * It can store both homo and hetro type of object
 * It is Legacy class
 * Default capacity->10
 * new capacity=oldcapacity*2
 * LIFO->Last In,First Out
 * Duplicates values->Allowed
 * Insertion order->Maintained
 * Index->Available
 * null values->Allowed
 * main methods->push(),pop(),peek()
 */
import java.util.Stack;
 public class List {
 public static void main(String[] args) {
  Stack<Integer> s=new Stack<>();
  s.push(100);
  s.push(200);
  s.push(300);
  s.push(400);
  s.push(500);
  s.pop();
  System.out.println(s.peek());
  System.out.println(s.search(100));
  System.out.println(s);  
  System.out.println(s.capacity());
 }
    
 }