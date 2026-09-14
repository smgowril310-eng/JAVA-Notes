//Cursor:
/**Cursor is used to traverse(read/access) the elements of a collection one by one
 * 
 * Types:
 * 1.Iterator:
 * Iterator is used to traverse elements in forward direction
 * Direction->Forward only
 * remove()->Allowed
 * Used with->Collection
 * Main methods->hasNext(),next(),remove()
 * 
 * 2.ListIterator:
 * ListIterator is used to traverse List elements in both forward and backward directions
 * Direction->Forward+Backward
 * add(),remove(),set()->Allowed
 * Used with->List only
 * 
 * 3.Enumeration:
 * Enumeration is a cursor used to traverse(read) elements one by one
 * It is mainly used with legacy classes like Vector and Hashtable
 * Direction->Forward only
 * Duplicate values->Allowed(depends on Collection)
 * remove()->Not supported
 * Main methods->hasMoreElements()->Checks whether there is another element available,nextElement()->Returns the next element and moves the cursor forward
 */
//Iterator:
// import java.util.ArrayList;
// import java.util.Iterator;
// public class Cursor {
//     public static void main(String[] args) {
//         ArrayList<Integer>a1=new ArrayList<>();
//         a1.add(10);
//         a1.add(30);
//         a1.add(40);
//         System.out.println(a1);
//         System.out.println("for loop");
//         for(int i=0;i<a1.size();i++){
//             System.out.println(a1.get(i));
//         }
//         ArrayList<Object> li=new ArrayList<>();
//         li.add("hi");
//         li.add('A');
//         li.add(100);
//         System.out.println(li);
//         System.out.println("For each loop");
//         for(Integer a:a1){
//             System.out.println(a);
//         }
//         for(Object a:li){
//             System.out.println(a);
//         }
//         System.out.println("Using Iterator");
//         Iterator<Integer> i=a1.iterator();
//         while (i.hasNext()) {
//             System.out.println(i.next());
//         }

//         while (i.hasNext()) {
//             Integer a=i.next();
//             if(a==10){
//                 i.remove();
//             }
//             System.out.println(a1);
//         }
//         Iterator<Object>i2=li.iterator();
//         while (i2.hasNext()) {
//             Object a2=i2.next();
//             if(a2 instanceof Integer){
//                 Integer b=(Integer)a2;
//                  System.out.println(b);
//             }
//             else if(a2 instanceof String){
//                 String s=(String)a2;
//                  System.out.println(s);

//             }
//             else if(a2 instanceof Character){
//                 Character c=(Character)a2;
//                  System.out.println(c);
//             }
//         }
//     }
// }

//ListIterator:
// import java.util.ArrayList;
// import java.util.ListIterator;
// public class Cursor {
// public static void main(String[] args) {
//      ArrayList<Integer>a1=new ArrayList<>();
//         a1.add(10);
//         a1.add(30);
//         a1.add(40);
//         System.out.println(a1);
//     ListIterator<Integer> l=a1.listIterator();
//     while (l.hasNext()) {
//         //System.out.println(l.next());
//         l.next();
//     }
//     while (l.hasPrevious()) {
//        // System.out.println(l.previous());   
//        Integer b=l.previous();
//        System.out.println(b);
//        if(b==10){
//         l.set(100);
//        }
//        else if(b==30){
//         l.remove();
//        }
//        else if(b==40){
//         l.add(200);
//        }
//        System.out.println(a1);
//     }
// }
    
// }

//Enumeration
import java.util.Enumeration;
import java.util.Vector;
public class Cursor {
public static void main(String[] args) {
  Vector<String> names=new Vector<>();
  names.add("Gowri");
  names.add("priya");
  names.add("Ram");
  
  Enumeration<String> e=names.elements();
  while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
  }
}
    
}