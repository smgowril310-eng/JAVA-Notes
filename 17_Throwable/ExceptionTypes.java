//Exception:
/** An Exception is an event that occurs during program execution and interrupts the normal flow of the program
 * 
 * Types:
 *  1.Checked Exception:
 *  A Checked Exception is checked by the compiler at compile time
 *  It must be handled using try catch or throws
 *  Types:
 *  1.IOException:
 *    IOException occurs when an input or output operation fails
 * 
 *  2.SQL Exception:
 *    SQL Exception occurs when a database operation fails
 * 
 *  3.FileNotFound Exception:
 *    FileNotFound Exception occurs when the specified file is not found
 * 
 *  4.ClassNotFound Exception:
 *    ClassNotFound Exception occurs when the JVM cannot find the specified class
 * 
 *  2.Unchecked Exception:
 *  An unchecked Exception occurs at runtime and is not checked by the compiler
 *  Types:
 *  1.Arithmetic Exception:
 *    Arithmetic Exception occurs when an illegal arithmetic operation is performed,such as dividing by zero
 * 
 *  2.NullPointer Exception:
 *    NullPointer Exception occurs when a null object is accessed
 * 
 *  3.ArrayIndexOutOfBounds Exception:
 *    ArrayIndexOutOfBounds Exception occurs when an invalid array index is accessed
 * 
 *  4.NumberFormat Exception:
 *    NumberFormat Exception occurs when a non-numeric string is converted into a number
 * 
 *  5.StringIndexOutOfBounds Exception:
 *    StringIndexOutOfBounds Exception occurs when an invalid index is used to access a String
 * 
 *  6.InputMisMatch Exception:
 *    InputMisMatch Exception occurs when the entered  input type does not match the expected data type
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionTypes {
    //IOException
    /**public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Test.txt");
        fr.read();
        fr.close();
}
    */
    //SQL Exception
    /**public static void main(String[] args) {
       try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
       }catch(SQLException e){
        System.out.println("Database Connection Error");
       }
    }
    */
    //FileNotFound Exception
    /**public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Test.txt");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
        */
    //ClassNotFound Exception
    /**public static void main(String[] args) {
        try{
            Class.forName("Student");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }
    }
    */
    //Arithmetic Exception
   /** public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
        */
    //NullPointerException
   /**public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("Object is null");
        }
    }
    */
    //ArrayIndexOutOfBoundsException
   /**public static void main(String[] args) {
        try{
            int[] arr = {10,20,30};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
    }
        */
   //NumberFormat Exception
   /**public static void main(String[] args) {
    try{
        int num = Integer.parseInt("ABC");
    }catch(NullPointerException e){
        System.out.println("Invalid Number Format");
    }
   }
    */
    //StringIndexOutOfBounds Exception
    /**public static void main(String[] args) {
        try{
            String s = "Java";
            System.out.println(s.charAt(10));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid String Index");
        }
    }
        */
    //InputMismatch Exception
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
        System.out.println("Enter Age:");
        int age = sc.nextInt();
       } catch(InputMismatchException e){
        System.out.println("Please enter a valid number");
       }
    }
}
