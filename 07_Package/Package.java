//Package:
/** A Package is a collection of realated classes and interfaces
 * It is used to organize Java programs
 * 
 * Types:
 * 1.Built-in Package:(predefined Package)
 *   A Built-in Package is a Package that is already created by Java
 *   we can use it directly
 * 
 * 2.User defined Package:
 *  A user defined Package is a Package created by the programmer
 */

 //Built-in Package
/**import java.util.Scanner;//Built-in Package
public class Package {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=scan.nextLine();
    System.out.println(name);
    }
}
    */

//User defined Package
//Package 07_Package;//User defined Package

public class Package{
 public static void main(String[]args){
    String name ="Gowri";
    System.out.println(name);
 }
}
