import java.util.Scanner;

/**Exception Handeling 3: finally Block
 * any resource(say: Scanner to take i/p from System) created must be closed so to avoid cloasing it in try and catch block(cause don't know which will execute) mostly all the closing statements are written in finally block 
 */
public class ExceptionHandeling3 {

    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Resource opened");
        try{
            
            num = scan.nextInt();  //CRITICAL STATEMENT must be written inside tryblock because can cause RunTimeException
            System.out.println("num= "+num);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.."+e);  //InputMismatchException
        }
        finally{
            scan.close();
            System.out.println("Resource closed");
        }

    }
}