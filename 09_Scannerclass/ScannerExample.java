//Scanner:
/** Scanner is a predefined class used to take input from the User
 * 
 * Methods:
 *  1.next():
 *    Reads one word
 * 
 *  2.nextLine():
 *    Reads a full line (including spaces)
 * 
 *  3.nextInt():
 *    Reads an integer
 * 
 *  4.nextDouble():
 *    Reads a decimal number
 * 
 *  5.nextFloat():
 *   Reads a float value
 * 
 *  6.nextBoolean();
 *    Reads a boolean value (true or false)
 * 
 *  7.nextByte():
 *    Reads a byte value
 * 
 *  8.nextShort():
 *   Reads a short value
 * 
 *  9.nextLong():
 *   Reads a long integer
 * 
 *  10.hasNext():
 *    Check whether there is another input available or not
 * 
 *  11.hasNextInt():
 *    Check whether the next input is an integer or not
 * 
 *  12.hasNextFloat():
 *    Check whether the next input is an float value or not
 */

import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter: ");
       // String name = scan.next();
       //String name = scan.nextLine();
       // System.out.println(name);
       //int number = scan.nextInt();
       //long number = scan.nextLong();
       //short number = scan.nextShort();
       //byte number = scan.nextByte();
       //System.out.println(number);
       //float decimal = scan.nextFloat();
       //double decimal = scan.nextDouble();
       //System.out.println(decimal);
       //boolean Boolean = scan.nextBoolean();
       //System.out.println(Boolean);
       System.out.println("Enter Age:");
       //if(scan.hasNext()){ 
       if(scan.hasNextInt()){
        int age = scan.nextInt();
        System.out.println("Age = "+ age);
       }
       else{
        System.out.println("Invalid Input");
       }
    }
}
