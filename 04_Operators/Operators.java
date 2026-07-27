//Operator:
 /**An Operator is a Symbol that performs an operation on one or more variables or Values
  * Types:
  *  1.Arithmetic operator:
       used to perform mathematical calculations
       operators      meaning
          +          Addition
          -          Subtraction
          *          Multipliction
          /          Division
          %          Modules(Remainder)

     2.Unary operator:
        Unary operator work on only one variable
        Operators      meaning
           ++         Increment
           --         Decrement
           !          Logical NOT
           ~          Negation

     3.Assignment Operator:
        used to assign values to Variables
        Operators    meaning
           =          x=10
           +=         x=x+10
           -=         x=x-10
           *=         x=x*10
           /=         x=x/10
           %=         x=x%10

     4.Relational (or) Comparison operator:
       used to compare two values returns true or false
       Operators     meaning
          ==         Equal to
          !=         Not Equal
          <          Less than
          >          Greater than
          <=         Less than or equal
          >=         Greater than or equal

     5.Logical Operator:
       used to combine multiple conditions
       Operators       meaning
          &&            AND
          ||            OR
          !             NOT
          
     6.Ternary Operator:
       A short form of if-else
       Syntax:
         Condition? true value:false value;

     7.Bitwise and Shift Operator:
      used to perform operations on binary bits
      Operators       meaning
         &             AND
         |             OR
         ^             XOR
         <<            left shift
         >>            right shift
         >>>           unsinged right shift
         ~             complement

    8.Type comparison operators:
       checks whether on object belongs to a particular class
       
       syntax:
    
        variable_name instance of Data_Type
          
  */ 

public class Operators {
  public static void main(String[] args) {
//Arithmetic Operator
    int A=50;
    int B=20;
    System.out.println("Arithmetic Operator:");
    System.out.println("Addition: "+ (A+B));
    System.out.println("Subtract: "+ (A-B));
    System.out.println("Division: "+ (A/B));
    System.out.println("Multiplication: "+ (A*B));
    System.out.println("Modules :"+ (A%B));

//Unary Operator
    int a = 10;
    System.out.println("Unary Operator:");
    System.out.println("preincrement: "+(++a));
    System.out.println(a);
    System.out.println("postincrement: "+(a++));
    System.out.println(a);
    System.out.println("predecrement: "+(--a));
    System.out.println(a);
    System.out.println("postdecrement: "+(a--));
    System.out.println(a);
    System.out.println("Logical NOT: "+(!true));
    System.out.println(a);
    System.out.println("Negation: "+(~a));

//Assignment Operators
    int b= 5;
     System.out.println("Assignment Operators:");
    System.out.println(b);
    b+=10;
    System.out.println(b);
    b-=10;
    System.out.println(b);
   b*=10;
   System.out.println(b);
   b/=2;
    System.out.println(b);
    b%=2;
    System.out.println(b);

    //Relational(Comparison) Operator
     int C=5;
     int D=10;
     System.out.println("Relational(Comparison) Operator:");
     System.out.println(C==D);
     System.out.println(C!=D);
     System.out.println(C>D);
     System.out.println(C<D);
     System.out.println(C>=D);
     System.out.println(C<=D);

     //Logical operator
     int c=2;
     int d=4;
     System.out.println("Logical operator:");
     System.out.println(c>d&&c>d);
     System.out.println(c<d||c>d);
     System.out.println(!(c>d&&c<d));

     //Ternary Operator
      System.out.println("Ternary operator:");
     int age =18;
     String Result = (age>=18)?"Adult":"Minor";
     System.out.println(Result);

     //Bitwise and Shift Operator
     System.out.println("Bitwise and Shift Operator:");
     int x=10;
     int y=1;
     System.out.println(x&y);
     System.out.println(x|y);
     System.out.println(x^y);
     System.out.println(x>>y);
     System.out.println(x<<y);
     System.out.println(x>>>y);
     System.out.println(~x);

     //Type Comparison Operator
     System.out.println("Type Comparison Operator:");
     String name = "Gowri";
     System.out.println(name instanceof String);
    }
} 
