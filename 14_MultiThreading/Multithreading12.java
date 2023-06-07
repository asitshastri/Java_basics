/**
 * Multithreading12: Dead Lock
 */
class Book implements Runnable
{
    String res1 = new String("Book1");
    String res2 = new String("Book2");
    String res3 = new String("Book3");
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try {
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println(name+" aquired "+res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println(name+" aquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println(name+" aquired "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something went wrong");
            }
        }
        else{
            try {
                Thread.sleep(3000);
                synchronized(res3){
                    System.out.println(name+" aquired "+res3);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println(name+" aquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println(name+" aquired "+res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something went wrong");
            }
        }
    }
}
public class Multithreading12 {
    public static void main(String[] args) {
        Book b = new Book();

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
    }
}