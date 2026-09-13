//Wrapper class (or) object:
/**Types:
 * 1.Boxing:
 * converting a primitive data type into its corresponding wrapper object manually
 * 
 * 2.AutoBoxing:
 * Automatic conversion of a primitive data type into its corresponding wrapper object
 * 
 * 3.Unboxing:
 * converting a wrapper object into its corresponding primitive data type manually
 * 
 * 4.AutoUnboxing:
 * Automatic conversion of a wrapper object into its corresponding primitive data type
 */
public class Types {
  public static void main(String[] args) {
    int a=10;
    Integer a1=Integer.valueOf(a);//Boxing
    System.out.println(a);
    System.out.println(a1);
    System.out.println(a1.getClass());
    Integer a2=a;//AutoBoxing
    System.out.println(a2);
     System.out.println(a2.getClass());
    Boolean b=true;
    boolean b1=b.booleanValue();//unboxing
    System.out.println(b1);
    boolean b2=b;//Autounboxing
    System.out.println(b2);
  }  
}
