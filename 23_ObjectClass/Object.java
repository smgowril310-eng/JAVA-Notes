//ObjectClass:
/**Object class is the root/superclass of all classes in java
 * Methods:
 * 1.wait()
 * 2.notify()
 * 3.notifyAll()
 * 4.equals()
 * 5.getClass()
 * 6.hashCode()->returns unique integer value
 * 7.clone()->copy object
 * 8.toString()->Address are convert to String
 * 9.finalize()
 */
// public class Object {
//     public static void main(String[] args) {
//         Object ob=new Object();
//         System.out.println(ob.getClass());
//         System.out.println(ob.hashCode());
//     }
// }

// public class Object implements Cloneable{
//     int b;
//     public static void main(String[] args) throws CloneNotSupportedException{
//       Object  ob=new Object();
//       ob.b=20;
//       System.out.println(ob.b);
//       Object obj=(Object)ob.clone();
//       System.out.println(obj.b);
//       obj.b=200;
//       System.out.println(ob.b);
//       System.out.println(obj.b);
//     }
// }

public class Object {
public String toString(){
    return "Object";
}
    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj);
    }
}