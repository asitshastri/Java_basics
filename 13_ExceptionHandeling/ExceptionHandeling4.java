import java.util.Scanner;

/**Exception Handeling 4: Try with Resources
 * Try with resources doest not require finally block to close the resource whatever resource passed to try block as argument will be closed after exebution of try block.
 */
public class ExceptionHandeling4 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Try with Resources");
        try(Scanner scan = new Scanner(System.in))
        {
            num = scan.nextInt();
            System.out.println("As this try with resources then the Scanner resource will be automatically closed.");
        }
        System.out.println("num= "+num);
    }
    
}