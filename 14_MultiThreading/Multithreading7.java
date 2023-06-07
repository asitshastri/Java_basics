/**
 * InnerMultithreading7: Multiple task within single run() 
 * (with implements Runnable)
 */
import java.util.*;
class Thread1class implements Runnable{
    public void run()
    {
        // Thread thread = new Thread();
        String tname =  Thread.currentThread().getName();
        if(tname.equals("Calc"))
        {
            CalC();
        }
        else{
            Msgg();
        }
    }
    public void CalC()
    {
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("****************************************************");
    }
    public void Msgg()
    {
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
       

        System.out.println("Displaying import message task ended");
    }
}
/**
 * Multithreading7
 */
public class Multithreading7 {

    public static void main(String[] args) {
        //creating Thread1class's object
        Thread1class c1 = new Thread1class();

        //creating Thread 
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        //changing thread names
        t1.setName("Calc");
        t2.setName("print");

        //starting threads
        t1.start();
        t2.start();
    }
}