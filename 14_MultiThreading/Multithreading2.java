/**
 * Multithreading 2: MAin Thread
 * main thread is created by default in java.
 * default name of main thread is: main
 * default priority of main thread is: 5
 * this default name and priority can be change by the developer
 */
public class Multithreading2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before change: name of current thread= "+Thread.currentThread().getName());
                        //or
        // String name  = Thread.currentThread().getName();
        // System.out.println(name);



        //Priority can also be given in case we are using more than 1 thread
        //Priority of main thread
        System.out.println("Before changing: Main Thread Priority= "+Thread.currentThread().getPriority());


        System.out.println("Changing main thread name and Priority");
        //create Thread class object
        Thread t = Thread.currentThread();
        t.setName("Thread1");
        t.setPriority(1);
        System.out.println("name and priority changed");

        System.out.println("After change: name of current thread= "+Thread.currentThread().getName());
        System.out.println("After change: Main Thread Priority= "+Thread.currentThread().getPriority());

    }
}