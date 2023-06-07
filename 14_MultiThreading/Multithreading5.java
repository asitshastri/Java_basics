import java.util.Scanner;
/**
 * Multithreading5: Cereating Thread by- Implementing Runnable interface
 * In case if the classes implements Runnable class then we have to create seperate thread objects and pass the class object as argument.
 * 
 * while in previous case where the classes extends the Thread class then creating their object is same as creating a new thread object.
 */
class Calc implements Runnable {
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"starting");
        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Enter A= ");
            int a = scan.nextInt();     //Until user input is not provided the other independent task will not be executing as there is only one line of flow(thread) thus wasting CPU's timecycle.
            System.out.print("Enter B= ");
            int b = scan.nextInt();
            int res = a+b;
            System.out.println("A+B= "+res);
        } catch (Exception e) {
            
            e.printStackTrace();

        }
        System.out.println(Thread.currentThread().getName()+"ended");
    }
}
class msgg implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Imp Message");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
/**
 * Multithreading5
 */
public class Multithreading5 {
    public static void main(String[] args) {
        //creating objects of above class
        msgg c1 = new msgg();
        Calc c2 = new Calc();

        //creatingThread class object with class reference as argument
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        //starting both threads so that Threas Scheduler register them and manage them automatically
        t1.start();
        t2.start();
    }
}