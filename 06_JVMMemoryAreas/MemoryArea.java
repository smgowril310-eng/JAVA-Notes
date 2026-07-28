//JVM Memory Areas:
/**JVM Memory Areas are different memory location used by the JVM to store data while a Java program is running
 *  1.Method Area:
 *    Stores class information,static variables,Methods and bytecode
 * 
 *  2.Heap memory:
 *    Stores objects and instance class
 * 
 *  3.Stack memory:
 *    stores local Variables and methods calls
 * 
 *  4.PC register:(Program counter register)
 *    stores the address of the current instruction being executed
 * 
 *  5.Native method Stack:
 *     Native method stack is a memory area in the JVM used to execute native methods(methods written in C or C++)
 *     It helps java interact with the operating system
 */


public class MemoryArea {
    String name = "Gowri";//Heap memory
   static String college = "Park College";//Method area
   public void display(){//Method area
    System.out.println("Hello");
   } 
   public static void main(String[] args) {
    System.out.println("Vedisamy");//Native method Stack
    int age = 20;//stack memory
    System.out.println(age);
    System.out.println(college);
    MemoryArea obj1 = new MemoryArea();//Heap memory
    MemoryArea obj2 = new MemoryArea();//Heap memory
    obj1.display();
    System.out.println(obj2.name);
    System.out.print("Java"+" ");//PC register
    System.out.print("is"+" "); //PC register
    System.out.println("Programming Language"); //PC register
   }
}
