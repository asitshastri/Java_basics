/**
 * Exception Handeling 5: Handeling Vs Ducking the Exception.
 */
class Demo
{
    public void A() throws Exception
    {
        B();
    }
    public void B() throws Exception
    {
        int a = 10;
        int b = 0;
        int num;
        num = a/b;
        System.out.println(num);
    }
}
public class ExceptionHandeling5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try{
            d.A();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()+" error");
        }

    }
}