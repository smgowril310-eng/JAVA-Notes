//Synchronization:
/**
 * Synchronization is a mechanism used to control access to a shared resource when multiple threads are running.
 * It helps prevent data inconsistency
 * 
 * Types:
 * 1.Synchronized Method:
 *  Synchronization is appplied to the entire method
 * 
 * 2.Synchronized Block:
 *  Synchronization is applied only to a particular block of code
 *
 */
//Synchronized Block:
// class Bank{
// int balance=1000;
//        void withdraw(int amount){
//         synchronized (this){
//             if (balance>=amount) {
//                 balance=balance-amount;

//                 System.out.println("Remaining:"+balance);
//             }
//             else{
//                 System.out.println("Insufficient balance");
//             }
//         } 
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//        Bank b=new Bank();
//        b.withdraw(500);
//        b.withdraw(200);
//        }  
//     }

//static synchronized:

class Main extends Thread{
    static synchronized void display(){
        System.out.println(Thread.currentThread().getName());
    }
    public void run(){
        display();
    }
 public static void main(String[] args) {
Main t1=new Main();
Main t2=new Main();

t1.start();
t2.start();
}
}