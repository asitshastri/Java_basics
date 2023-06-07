/**
 * Multithreading10: Thread interruption: interrupt() method
 * Thread is only interrupted when its in Blocked/waiting state (i.e when either sleep() or join() method is envoked)
 */
class JoinisAlive implements Runnable{
    public void run()
    {
        
        for(int i=0; i<3; i++)
        {
            try{
                System.out.println(i+1+") Focus is imp");
            Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted: "+e.getMessage());
            }
            
        }

    }
}
public class Multithreading10 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" Thread started");

        JoinisAlive c1 = new JoinisAlive();

        Thread t1 = new Thread(c1);

        t1.start();
        t1.interrupt();
        System.out.println(Thread.currentThread().getName()+"Thread ended");
    }
}