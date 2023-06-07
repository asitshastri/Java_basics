import java.util.Scanner;
/**
 * Multithreading4: 
 * Creating a Thread by extending the Thread class 2
 */

class Calc extends Thread{
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
class Msg extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"starting");
        System.out.println("Displaying msg");
        for(int i=0;i<4;i++)
        {
            System.out.println(i+1+") Important msg");
            try {
                Thread.sleep(2000);  //checked Exception so inside try-catch block
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //sleep for 2 second
        }
        System.out.println("Task3 ended");
        System.out.println(Thread.currentThread().getName()+"ended");
    }
}
class PatternPrint extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"starting");
        for(int i=0; i<4 ; i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(Thread.currentThread().getName()+"ended");
    }
}
public class Multithreading4 {
    public static void main(String[] args) {
        System.out.println("Main Thread started: "+Thread.currentThread().getName());

        Calc t1 = new Calc();

        Msg t2 = new Msg();

        PatternPrint t3 = new PatternPrint();

        t1.start();
        t2.start();
        t3.start();
        
    }
}