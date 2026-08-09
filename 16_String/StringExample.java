//String:
/**String is a sequence of characters used to store text
 * It is immutable,once created it cannot be changed and it is thread safe and synchronized
 * 
 * literal:
 *  A String literal is created by assigning a string value directly using double quotes(" ")
 *  It is stored in the String pool
 * 
 * Non literal:
 *  A Non literal String is created using the new keyword
 *  It creates a new Object in Heap memory
 * 
 */
public class StringExample{
   public static void main(String[] args){
    String name = "Gowri";//literal
    System.out.println(name);
    String name1 = new String("Vedisamy");//non literal
    System.out.println(name1);
   }
}
