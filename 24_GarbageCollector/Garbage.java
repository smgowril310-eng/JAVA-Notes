//GarbageCollector:
/**
 * Garbage Collector is an automatic memory management mechanism in java that identifies and removes unreachable objects and reclaims their memory 
 * It is used to collect unreferenced objects or unused memorice
 * 
 * Unreferenced object generate:
 * 1.nulling object reference
 * 2.reassigning the object reference
 * 3.creating anonymouse object
 * 4.creating object inside the method
 */
//nulling object reference
// public class Garbage {
//     public static void main(String[] args) {
//     Garbage ob=new Garbage();
//     System.out.println("Object created");
//     ob=null;
//     System.gc();
//      System.out.println("Object is eligible for GC");
//   }
// }

//reassigning the object reference
// public class Garbage {
// public static void main(String[] args) {
//     Garbage obj=new Garbage();
//     obj=new Garbage();
//     System.gc();
//     System.out.println("Old object is eligible for GC");
// }
    
// }

//Creating anonymouse object
public class Garbage {
void display(){
    System.out.println("Hello");
}
 public static void main(String[] args) {
    new Garbage().display();
    System.gc();
    System.out.println("Anonymous object may be eligible for GC");
 }   
}

//creating object inside the method
// public class Garbage {
// void demo(){
//     Garbage ob=new Garbage();
//     System.out.println("Object created inside method");
// }
// public static void main(String[] args) {
//     Garbage ob=new Garbage();
//     ob.demo();
//     System.gc();
//     System.out.println("Object created inside method may be eligible");
// }
    
// }
