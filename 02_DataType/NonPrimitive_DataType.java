//NonPrimitive DataType:
/**
 * NonPrimitive DataTypes are reference types
 * they can store object or collections of values
 *   1.String:
 *     String is used to store text
 *   2. Array:
 *     Stores multiple values of the same dataType
 *   3.class:
 *     A class is a bluePrint for creating object
 *   4.object:
 *     An object is an instance of a class
 *   5.interface:
 *    An interface contains abstract methods that a class methods
 */
//String
/**
public class NonPrimitive_DataType {
    public static void main(String[] args) {
        String name ="Gowri";
        System.out.println(name);
    }
}
*/

//Array
/*public class NonPrimitive_DataType {
    public static void main(String[] args) {
       int [] marks ={99,100,98,99,100};
       for(int i=0;i<=marks.length; i++)
        System.out.println(marks[i]);
    }
}
*/

//class_and_object
/*public class NonPrimitive_DataType {//class
     String name ="Gowri";
    public static void main(String[] args) {
        NonPrimitive_DataType obj= new NonPrimitive_DataType();//object
        System.out.println(obj.name);
    }
}
*/

//interface
  public interface NonPrimitive_DataType {
    void method();
  }
 class Interface implements NonPrimitive_DataType{
    public void method(){
        System.out.print("Interface is a Non primitive Data Type");
    }
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.method();
    }
 }

