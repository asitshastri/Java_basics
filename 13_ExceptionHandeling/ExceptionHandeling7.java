/**Exception Handeling 7: Custom Exception 
 * Create a custom exception named "MyException"
 *      Create Myexception class
 *      make it a child class of Exception classs
 *      
 */

class MyException extends Exception
{
    public MyException(){}
    public MyException(String msg){
        super(msg); //as priting msg is a work of Exception Class so using super method to call the parent exception class
    }
}
public class ExceptionHandeling7 {

    public static void main(String[] args) {
        int num =6;
        int num2 = -2;
        try{
            if(num2<0)
            {
                Exception e = new MyException("number < zero ");
                throw e; //throw a custom error 
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