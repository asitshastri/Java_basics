/**ENUM
 * Introduced in java 1.5
 * Whenever we have pre-defined named constants then we use ENUM concept.
 * example: all the days in a week are the set of values that always remains constant/same.
 * 
 * Advantage of using enum
 *      For describing a constant in java we have to describe its access-modifier,static/non-ststic,type etc.
 *      ex:public static int MON;
 *      So if we have a lage no of constants it creates a problem
 *      to avoid this enum concept is introduced
 * 
 * "Enum" is an in-built class inside "java.lang" package
 */

/*Defining pre-defined named constants inside enum */
enum Week
{
    MON,TUE,WED,THU,FRI,SAT,SUN; //IT IS A CONVENTION TO NAME CONSTANTS WITH CAPITAL LETTERS IN JAVA.
}

public class Launch6_ENUM {
    enum Result
    {
        PASS,FAIL,NR;
    }
    public static void main(String[] args) {
        System.out.println("Introduction to ENUM in java: ");
        
        /*As we can't create object of abstract class and interface similarly we can't create object of enum. */
        /*accessing enum class */
        Week d1 = Week.MON;     //enum of type Week
        System.out.println(d1);

        /*accessing enum Result */
        Result rp = Result.PASS;
        System.out.println(rp);

        /*Oridinal Method: used to print index of the Enum */
        int index = Week.TUE.ordinal();
        System.out.println("index of "+Week.TUE+": "+index);

        /*value(): to make array of all the Enum  */
        Week wk[] = Week.values();
        for(Week w1:wk)
        {
            System.out.println(w1+" : "+w1.ordinal());
        }
    }
}