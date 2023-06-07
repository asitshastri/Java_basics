import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Exception Handeling 8: Hierarchy of Exception Class and Checked Unchecked Exception
 * all the Exceptions instead os RunTimeException are checked Exceptions
 */
public class ExceptionHandeling8 {
    public static void main(String[] args) {
        
        int result = 7/0; //Unchecked Ecxecption: It is a RunTimeException so only checked after compilation
        


        //before Scanner BufferReader class is used to take user input
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();  //checked exception: always checked before compilation
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        System.out.println("Exception Handeled");

    }
}