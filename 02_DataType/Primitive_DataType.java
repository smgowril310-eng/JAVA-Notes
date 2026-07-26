//DataType:
/**
 * A DataType defines the types of data that a variable can store
 * Java DataType are divided into 2 categories:
 * Primitive DataType
 * Non Primitive DataType
 */

 //Primitive DataType:
   /**  Primitive DataType are the basic build in Data Type in Java
    *   They store a single value
    *   Formula:
          -2^n-1 to (2^n-1)-1 
          1 byte = 8 bits
    *   Integers: whole number 
          1.byte: 1 byte = 8bits
             Stores whole numbers from -128 to 127

          2.short: 2 bytes = 16bits
            stores whole number from -32,768 to 32,767

          3.int: 4 bytes = 32bits
             Stores whole number from -2,147,483,648 to 2,147,483,647

          4.long: 8 bytes = 64bits
             Stores whole number from -9,223,372,036,854,775,808L to 9,223,372,036,854,775,807L

    *   floating-point: decimal
          1.float: 4 bytes = 32bits
            Stores decimal numbers sufficient for Storing 6-7 decimal digits

          2.double: 8 bytes = 64bits
            Stores decimal number sufficient for Storing 15-16 decimal digits

    *   character: Single character
          1.char: 2 bytes = 16bits
           Stores a single unicode character

    *   Boolean: true or false
          1.boolean: 1 bytes = 8bits
           Stores true or false values
    */
public class Primitive_DataType {
 public static void main(String[] args) {
  byte a = -128; //3
  short b = 32767; //5
  int c = 2147483647;//10
  long d =  9223372036854775807l;//19L
  float e = 2.2345678f;
  double f = 5.1234567890;
  char g = 'G';
  boolean h = true;
  System.out.println("byte:"+a);
  System.out.println("short:"+b);
  System.out.println("int:"+c);
  System.out.println("long:"+d);
  System.out.println("float:"+e);
  System.out.println("double:"+f);
  System.out.println("char:"+g);
  System.out.println("boolean:"+h);
 }   
}
