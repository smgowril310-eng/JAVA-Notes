//DaemonThread:
/**A Daemon thread is a background thread that runs to support other threads
 * When all user threads finish,the JVM automatically terminates the daemon thread
 * 
 * Methods:
 * isDaemon()
 * setDaemon() 
 */
public class DaemonThread extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("lighting...");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
public static void main(String[]args)throws InterruptedException{
DaemonThread ob=new DaemonThread();
ob.setDaemon(true);
ob.start();
System.out.println(ob.isDaemon());
for(int i=0;i<10;i++){
    System.out.println("dancing...");
    Thread.sleep(1000);
}
    
    }
    
}
