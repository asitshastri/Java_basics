/**
 * Multithreading11 : Synchronization in java
 * using synchronizzed keyword
 */
class Car implements Runnable{
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+" has entered parking lot.");
            Thread.sleep(2000);

            synchronized(this)
            {
            System.out.println(Thread.currentThread().getName()+" got into the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" came back and parked the car");
            Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem: "+e.getMessage());
        }
    }
}
public class Multithreading11 {
    public static void main(String[] args) {
        Car c1 = new Car();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}