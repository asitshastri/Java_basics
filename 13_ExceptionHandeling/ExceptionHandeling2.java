/**Exception Handeling 2: Try with multiple catch block
 * 
 */
public class ExceptionHandeling2 {

    public static void main(String[] args) {
        int x=6;
        int y =0;
        int result = 0; //result in declared outside try cuz inside try its scope end in try block and it will always exception
        int values[] = {2,5,3,7};
        int result2 = 0;
        String name = null;
        try {
            result = x/y;
            result2 = x/name.length();
            System.out.println(values[5]);
            System.out.println(result);
            System.out.println(result2);
        } 
        catch (ArithmeticException e)   //Operations can also be performed in catch block ex: if failed to connect a certain database the in catch block we can provide second data base to connect.
        {
            // System.out.println(e); //use this to print Exception name
            System.out.println("Cannot divide by zero "+e);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("please provide correct index: "+e);
        }
        catch(Exception e) //always include if you don't know the exception
        {
            System.out.println("Something went wrong..");
        }

        System.out.println("oustside try:This mean program did not stop because of Exceptions"); //try writing normal statements outside try block
    }
}