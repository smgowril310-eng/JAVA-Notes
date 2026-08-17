//Exception Handling:

import java.io.IOException;

/**Exception Handling is a mechanism used to handle runtime errors and continue the normal execution of the program without terminating it
 * 1.try:
 *  contains the risky code that may cause an exception
 * 2.catch:
 *  catches and handles the exception
 * 3.finally:
 *  Executes whether an exception occurs or not
 * 4.throw:
 *  used to manually throw an exception
 * 5.throws:
 *  Declares that a method may throw an exception
 */
public class ExceptionHandling {
    static void readFile() throws IOException{
        throw new IOException("File Not Found");
    }
    public static void main(String[]args) throws IOException{
        //readFile();
        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Finally Block Executed");
        }
    }
}
