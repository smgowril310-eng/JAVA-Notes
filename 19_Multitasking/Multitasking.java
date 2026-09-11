//Multitasking:
/**Executing multiple task simulteneously then its known as multitasking (or)
 * Multitasking means doing more than one task at the same time
 * Java supports multitasking mainly using Threads
 * Types:
 * 1.Process based Multitasking:
 * Executing multiple task simultaneously where each task is the seperate process(or)
 * Multiple processes execute at the same time
 * It is stored seperate memory
 * It is also called as Multi process
 * 
 * Ex:Running Chrome + VS code + Calculator simultaneously
 * 
 * 2.Thread based Multitasking:
 * Executing multiple task simultaneously where each task is the seperate part of the process (or)
 * Executing multiple tasks within a single program using multiple threads
 * It is stored shared memory
 * It is also called as multithreading 
 * 
 * Thread:
 * Thread is small unit of execution of the process 
 * It is used to Gaming,animation,video and cartoons
 * Two ways to create a thread:
 * 1.Implementing runnable interface
 * 2.Extending thread class
 */

class MultiThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("runnable interface");
        }
    }
}
public class Multitasking extends Thread{
public void run(){
    for(int i=0;i<5;i++){
        System.out.println("run method");
    }
}    
public static void main(String[] args) {
    Multitasking ob = new Multitasking();
    ob.start();
    for(int i=0;i<5;i++){
        System.out.println("main method");
    }
    MultiThread obj=new MultiThread();
    Thread t=new Thread(obj);
    t.start();
}
}
