//InterthreadCommunication :
/**Interthread communication is a mechanism by which one thread communicates with another thread to coordinate their execution
 * 
 * Main Methods:
 * Java provide three important methods: 
 * 1.wait()
 * 2.notify()
 * 3.notifyAll()
 * These methods belong to the object class
 */
public class InterthreadCommunication {
        synchronized void show() throws InterruptedException{
        System.out.println("Waiting...");
        wait();
        System.out.println("Thread resumed");
    }
    synchronized void wake(){
        System.out.println("Notify thread");
        notify();
    }
public static void main(String[] args)throws Exception {
   InterthreadCommunication obj=new InterthreadCommunication();
   Thread t1=new Thread(() ->{
    try{
        obj.show();
    }catch(InterruptedException e){
        System.out.println(e);
    }
   });
   Thread t2=new Thread(()->{
    obj.wake();
   });
   t1.start();
   Thread.sleep(1000);
   t2.start();
   }
}
