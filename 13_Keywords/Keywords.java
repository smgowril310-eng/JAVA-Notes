//Keyword:
 /**Keyword are reserved words in java that have a predefined meaning
  * They cannot be used as variable name,methods names or class names

   DataTypes:
   1.byte
   2.short
   3.int
   4.long
   5.float
   6.char
   7.boolean
   8.double

   Control Statements:
   1.if
   2.else
   3.switch
   4.case
   5.default
   6.while
   7.do
   8.for
   9.break
   10.continue
   11.return

   Class & Object:
   1.class
   2.interface
   3.extends
   4.implements
   5.this:
    The this keyword refers to the current object of the class
   6.super:
    The super keyword refers to the parent class object
    It is used to access the parent class variables,methods and constructors

    Access Modifiers:
    1.public
    2.protected
    3.default
    4.private

    Non access modifiers:
    1.static
    2.final
    3.abstract
    4.synchronized:
    The synchronized keyword allows only one thread to execute a method or block at a time

    5.transient:
    The transient keyword is used to avoid saving a variable during serialization

    6.volatile:
    The volatile keyword ensures that all threads see the latest value of a variable

    Object & Memory:
    1.new
    2.null
    3.instanceof
    4.assert:
     The assert keyword is used to test whether a condition is true
     If the condition is false, java throws an AssertionError

     Packages:
     1.package
     2.import:
     The import keyword is used to access classes or Packages from another package

     3.module:
     A Module is a collection of related package 
     It helps organize large applications and improves security

     Java reserved literals:
     1.true
     2.false
     3.null

     unused keywords:
     1.Go
     2.to
     3.Gonest

  */
  //synchronized
/**public class Keywords {
    synchronized void display(){
        System.out.println("only one thread can access");
    }
    public static void main(String[] args) {
        Keywords k =new Keywords();
        k.display();
    }
}
*/

//transient
/**public class Keywords {
 String name = "Gowri";
 transient String Password = "12345";
 public static void main(String[] args) {
    Keywords k =new Keywords();
 System.out.println(k.name);
 System.out.println(k.Password);
    }
}
*/

//volatile
/**public class Keywords {
volatile boolean flag = true;
public static void main(String[] args) {
    Keywords k = new Keywords();
    System.out.println(k.flag);
}
}
*/

//assert
public class Keywords {
public static void main(String[] args) {
    int mark=4;
    assert mark >=35: "Student failed";
    System.out.println("Student Passed");
}
}