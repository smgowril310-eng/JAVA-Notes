//InnerClass:
/**An innerclass is a class that is declared inside another class or interface
 * It is used to logically group related class and improve encapsulation
 * 
 * Types:
 * 1.Non Static inner class:
 * A Nonstatic inner class is a class declared inside another class without using static keyword
 * It can access the members of the outer class,including private members 
 * Types: 
 *  1.Memmber inner class:
 *    A Member innerclass is a nonstatic class declared as a members of another class 
 *    It can access the members of the outer class directly,including private members
 * 
 *  2.Method local inner class:
 *    A class declared inside a method is called a Method Local Inner class
 * 
 *  3.Anonymouse class:
 *    An anonymouse class is a class without a name that is declared and instatiated at the same time.
 *    It is mainly used for implementing an interface or overriding a class method for a one time use.
 * 
 * 2.Static innerclass:
 *    A static innerclass is a nested class declared with the static keyword inside another class
 *    It can be created without creating an object of the outerclass and can directly access the static members of the outer class
 */

//Member inner class
// class Bank{//outer class
//     private int balance=1000;
//     void deposite(){
//         balance+=2000;
//         System.out.println("deposited..."+balance);
//     }
//     class Gpay{//Inner class
//         void trans(){
//             int transferamount=1000;
//             balance-=transferamount;
//             System.out.println("transfered..."+balance);
//         }
//     }
// }
// public class Innerclass {
//  public static void main(String[] args) {
//     Bank ob=new Bank();
//     ob.deposite();
//     Bank.Gpay obj=ob.new Gpay();
//     obj.trans();
//  }   
// }

//Method local inner class
// class Bank{//outer class
//    void NetBanking(){
//     class CashBack{
//         void PaymentOption(){
//             System.out.println("Congrat...");
//         }
//     }
//     CashBack ob=new CashBack();
//     ob.PaymentOption();
//    }
// }
// public class Innerclass {
// public static void main(String[]args){
//     Bank obj=new Bank();
//     obj.NetBanking();
// }
// }

//Anonymouse class
// class One1{
//     void method(){
//         System.out.println("Old Version");
//     }
// }
// abstract class Two2{
//         abstract void demo();
//     }
//     public class Innerclass{
//         public static void main(String[] args) {
//             One1 ob=new One1(){
//                 void method(){
//                     System.out.println("new version");
//                 }
//             };
//             ob.method();
//             Two2 obj=new Two2() {
//                 void demo(){
//                     System.out.println("abstract method");
//                 }
//             };
//             obj.demo();
//             Thread t=new  Thread(){
//                 public void run(){
//                     System.out.println("run method");
//                 }
//             };
//             t.start();
//             Runnable r=new Runnable() {
//                 public void run(){
//                 System.out.println("runnable interface");
//                     }           
//                  };
//                  Thread t1=new Thread(r);
//                  t1.start();
//         }
//     }

//static inner class
class Outer{
    static int x=10;
    static class Inner {
    void display(){
        System.out.println("x="+x);
    }
        
    }
}
public class Innerclass {
public static void main(String[] args) {
    Outer.Inner obj=new Outer.Inner();
    obj.display();
}
    
}