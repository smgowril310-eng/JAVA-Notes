//MultiThread Methods:
/**1.start():
 It is used to start a new thread.
 It automatically calls the run() method.

 2.sleep():
 It is temporarily pauses the execution of a thread for a specified amount of time

 3.join():
 It makes one thread wait until another thread completes

 4.yield():
 It gives a hint to the thread scheduler that the current thread is willing to give another thread a change to execute

 5.getName():
 Returns the name of the thread

 6.setName():
 Used to change the name of a thread

 7.currentThread():
 Returns the currently executing thread

 8.getState():
 Returns the current state of a thread

 common States:
 1.NEW->Thread created but not started 
 2.RUNNABLE->Ready/running
 3.BLOCKED->Waiting for a Lock
 4.WAITING->Waiting indefinitely
 5.TIMED_WAITING->Waiting for a specific time
 6.TERMINATED->Thread completed

 9.isAlive():
 Checks whether a thread is still running

 10.setPriority():
 Used to set the priority of a thread

 Priority range:
 1->MIN_PRIORITY
 2->NORM_PRIORITY
 3->MAX_PRIORITY

 11.getPriority():
 Returns the priority of a thread

 12.activeCount():
 Returns the approximate number of active threads in the current thread's thread group

 */
class Methods extends Thread{
    public void run(){
      //  System.out.println("Thread is running");
      for(int i=1;i<=3;i++){
        System.out.println(i);
         //Thread.yield();
        // try{
        //     Thread.sleep(2000);
        // }
        // catch(InterruptedException e){
        //     System.err.println(e);
        // }
      }      
    }
    public static void main(String[] args) throws InterruptedException {
        Methods m=new Methods();
        m.setPriority(10);
       // System.out.println(m.getState());
       //System.out.println(m.isAlive());
       System.out.println(m.getPriority());
        m.start();
       // System.out.println(m.isAlive());
       // System.out.println(m.getState());
        m.setName("First Thread");
        //System.out.println(m.getName());
       // System.out.println(Thread.currentThread().getName());
        //m.join();
        System.out.println("Main Thread");
        System.out.println(Thread.activeCount());
    }
    
}
