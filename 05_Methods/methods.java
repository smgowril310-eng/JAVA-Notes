//Method:
/** A Method is a block of code that performs a specific task
 * It can be reused whenever needed
 * 
 * Types:
 *   1.Predefined Method:(Built in method)
 *      These methods are already created by java
 *      we can use them directly
 * 
 *   2.User defined method:
 *       A Method created by the programmer is called a user defined method
 * 
 * Method Signature:
 *  A Method Signature consists of the Method Name and its Parameter list
 *  It does not include the return type
 *  Syntax:
 *    Method_name(parameter1,parameter2...)
 * 
 * //Parameter:
 *  Parameters are the values passed to a method
 * 
 * //Return Type:
 * The Return Type specifies the type of value returned by a method 
 * 
 * Method characteristics:
 *  1.Return Type with Argument:
 *    The method accepts arguments and returns a value
 * 
 *  2.Return Type without Argument:
 *    The method does not accepts arguments but returns a value
 * 
 *  3.Non-Return Type with Arugument:
 *    The method accepts arguments but doesn't return any value
 * 
 *  4.Non-Return Type without Argument:
 *    The method does not accept arguments and does not return any value
 * 
 * Method Overloading:
 *  Method overloading means having multiple methods with the same name but different  parameters in the same class
 * 
 * Method Overriding:
 *  Method Overriding means a child class provides its own implementation of a parent class method
 * 
 * Recursion:
 *  Recursion is a Process where a method calls itself
 */

 //Predefined & User defined Method 
/**public class methods {
     static void greet(){ //User defined Method 
        System.out.println("Hello Gowri");
     }
     public static void main(String[] args) {
        greet();
        String name = "Vedisamy";
        System.out.println(name.toUpperCase());//Predefined method
     }
}
*/

//Return type with argument & Return type without argument
/**public class methods {
  static int add(int a,int b){//Return type with argument
    return a+b;
  }

  static int number(){// Return type without argument
    return 100;
  }
  public static void main(String[] args) {
    System.out.println(number());
    int result = add(10,20);
    System.out.println(result);
  }
    
}
  */

//Non-Return type with argument & Non-Return type without argument
/**public class methods {
 static void greet(String name){ //Non Return Type with Argument
    System.out.println("Hello "+name);
 }
 static void message(){ //Non-Return type without argument
    System.out.println("Welcome to Java");
 }
public static void main(String[] args) {
    greet("Vedi");
    message();
}
}
*/

//Method overloading 
/**public class methods {
  void display(){
    System.out.print("a "+"=");
  }
  void display(int a){
    System.out.print(a);
  }
  public static void main(String[] args) {
   methods obj = new methods();
   obj.display();
   obj.display(10);
  }
}
*/

//Method overriding
/**class Method {
 void greet(){
  System.out.println("Greet warming");
 }
 void display(){
    System.out.println("Display the method");
 }
}
 class Function extends Method{
@Override
 void display(){
    System.out.println("Display the function");
 }
 }
 public class methods{
 public static void main(String[] args) {
    Function obj = new Function();
    obj.display();
    obj.greet();
 }
}
*/

//Recursion
public class methods {
  void Print(int n){
    if(n>0){
      System.out.println(n);
      Print(n-1);
    }
  }
  public static void main(String[] args) {
    methods obj = new methods();
    obj.Print(6);
  }
}