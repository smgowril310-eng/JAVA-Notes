//Variable:
/**
 * Variables is a container used to store data or information
 * 
 * Variable declaration :
 * int a;
 * 
 * Variable initialization:
 * int a = 100;
 * 
 * Types:
 * 1.Instance Variable:
 * An instance variable is declared inside a class but outside all methods.
 * Each object has it own copy
 * 
 * 2.Static Variable:
 * A static variable is declared using th Static keyword
 * It is shared by all object of the class
 * 
 * 3.Local Variable:
 * A Local Variable is declared inside a method,constructor or block
 * It can be used only within that method
 */

// Instance variable
public class Variable {
   int a = 10;// instance variable
   static String name = "Gowri";//static variable
   public static void main(String[] args) {
      long b = 12344l; //local variable
      System.out.println("local variable: "+b);
      System.out.println("Static variable: "+Variable.name);
      Variable obj = new Variable();
      System.out.println("instance variable: "+obj.a);
   }
}
