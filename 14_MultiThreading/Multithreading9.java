import java.util.Scanner;
/*join() and isAlive() method */
class Printing implements Runnable{

    public void run()
    {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter number of message to print");
            int ip = scan.nextInt();
            for(int i=0;i<ip;i++)
            {
                System.out.println(i+1+") Focus is important");
                Thread.sleep(2000);
            }

        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}

public class Multithreading9 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" Thread Started");

        Printing p1 = new Printing();

        Thread t1 = new Thread(p1);

        System.out.println("is "+t1.getName()+" alive?: "+t1.isAlive());
        t1.start();
        System.out.println("is "+t1.getName()+" alive?: "+t1.isAlive());
        try {
            t1.join(); //Checked Exception: InterruptedException shown which needs to be inside try-catch
            //.join used to wait until t1 thread ends
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        } 

        System.out.println(Thread.currentThread().getName()+" Thread ended");
    }
}
