/**Exception Handeling 6: Custom Exception and THROW keyword
 */
public class ExceptionHandeling6 {
    public static void main(String[] args) {
        int num =6;
        int num2 = -2;
        try{
            if(num2<0)
            {
                Exception e = new ArithmeticException("Negative number not accepted"); //ArithematicException has 
                throw e;
            }
            else{
            int result = num/num2;
            System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }

    }
}