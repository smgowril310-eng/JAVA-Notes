//Error:
/**An Error is a serious problem that occurs during program execution 
 * It is caused by the JVM and usually cannot be handled by the programmer
 * Types:
 * 1.StackOverflow Error:
 *  occurs when a method calls itself repeatedly without stopping
 * 
 * 2.OutOfMemory Error:
 *  occurs when the JVM runs out of memory
 * 
 * 3.VirtualMachine Error:
 * occurs when the Java Virtual Machine encounters a serious internal problem and cannot continue program execution
 */

 //StackOverflow Error
/**public class Error {
  static void display() {
    display();
  }
  public static void main(String[] args) {
    display();
  }
}
*/

//OutOfMemory Error
/**public class Error{
    public static void main(String[] args){
        long[] arr = new long[1000000000];
        System.out.println(arr);
        System.out.println("Array Created");
    }
}
    */

//VirtualMachine Error
public class Error{
    public static void main(String[]args){
        throw new VirtualMachineError("JVM Error"){};
    }
}