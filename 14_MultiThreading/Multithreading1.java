import java.util.Scanner;

/**
 * Multithreading1
 */
public class Multithreading1 {

    public static void main(String[] args) {
        System.out.println("***********************************************************************");
        System.out.println("Task 1 Strated");
        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Enter A= ");
            int a = scan.nextInt();     //Until user input is not provided the other independent task will not be executing as there is only one line of flow(thread) thus wasting CPU's timecycle.
            System.out.print("Enter B= ");
            int b = scan.nextInt();
            int res = a+b;
            System.out.println("A+B= "+res);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
        System.out.println("Task1 ended");
        System.out.println("***********************************************************************");


        System.out.println("Task2 Started");
        for(int i=0; i<4 ; i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Task2 ended");
        System.out.println("***********************************************************************");

        System.out.println("Task3 started");
        System.out.println("Displaying msg");
        for(int i=0;i<4;i++)
        {
            System.out.println(i+1+") Important msg");
        }
        System.out.println("Task3 ended");
        System.out.println("***********************************************************************");

    }
}