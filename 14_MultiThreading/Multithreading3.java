/**
 * Multithreading 3: How to create Threads
 * There are 2 ways of creating threads in java
 *      1)- By extending Thread class.
 *      2)- By implementing Runnable interface.
 */

/*Creating a Thread by extending the Thread class */
class MyThread extends Thread{
    public void run()
    {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
public class Multithreading3 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println(Thread.currentThread().getName());

        MyThread t = new MyThread();
        t.start();
    }
}