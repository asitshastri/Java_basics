/**
 * Launch7_ENUM2
 */
/* */
enum Result
{
    PASS,FAIL,NR; //pre-defined constants

    /*inside an enum we cam also define veriables, constructor and methods*/
    //veriable
    int marks;

    /*Constructor
     * In Enum contructor is called about same no. of times as there are constants inside it
     * Reason
     *      What happens whenever we make a constant behind the scene Result named class is created that extends to Enum class inside lang package
     *      and also objects are created behind the scene as:-
     *          public static final Result PASS= new Result();
     *          public static final Result FAIL= new Result();
     *          public static final Result NR= new Result();
     *      So,for 3 enum constants 3 objects are created calling the constructor 3 times.
     */
    Result()
    {
        System.out.println("Constructor inside enum");
    }
    
    //setter method
    void setmarks(int marks)
    {
        this.marks = marks;
    }
    
    //getter method
    int getMakrs()
    {
        return marks;
    }
}
public class Launch7_ENUM2 {
    public static void main(String[] args) {
        System.out.println("More on Enum");

        /*setting PASS object's marks:  */
        Result.PASS.setmarks(50);

        /*getting PASS marks stored in PASS object */
        int m1 = Result.PASS.getMakrs();
        System.out.println(m1);

        /*Getting Marks stored in FAIL object */
        int m2 = Result.FAIL.getMakrs();
        System.out.println(m2); //marks inside the FAIL object in not set therefore default int value is printed

        Result.NR.setmarks(36);
        int m3 = Result.NR.getMakrs();
        System.out.println(m3);
    } 
}