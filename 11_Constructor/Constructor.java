//Constructor:
/** A Constructor is a special method used to initialize an object
 *  It is automatically called when an object is created
 * 
 * Characteristics:
 *  1.Constructor name must be the same as the class name
 *  2.It does not have a return type (not even void)
 *  3.It is called automatically when an onject is created using "new"
 * 
 * Types:
 * 1.Default Constructor:
 *  A Default Constructor is automatically created by the Java compiler if you do not write any constructor
 * 
 * 2.No Argument Constructor:
 *  A No Argument Constructor is a constructor written by the programmer without parameters
 * 
 * 3.Parameterized  Constructor:
 *  A Parameterized  Constructor is a constuctor that accepts one or more parameters
 */

 //Default Constructor
/**public class Constructor {
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println("Default Constructor");
    }
}
*/

//No Argument and Parameterized Constructor
public class Constructor {
Constructor(){//No Argument Constructor
    System.out.println("No Argument Constructor");
}
Constructor(String word){
  System.out.println("Type: "+word);
}
public static void main(String[] args) {
    Constructor obj = new Constructor();
    Constructor obj1 = new Constructor("Parameterized Constructor");
}
}