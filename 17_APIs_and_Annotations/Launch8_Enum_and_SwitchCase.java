import Launch6_ENUM.Result;

/**
 * Enum and Switch Case:
 */
enum Result
{
    PASS,FAIL,NR;
}
public class Launch8_Enum_and_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enum and Switch Case:");
        Result res = Result.FAIL;

        switch(res)
        {
            case PASS: System.out.println("Passed!");
            break; //if break is not applied then all the case after PASS will be executed

            case FAIL: System.out.println("Failed!");
            break; ////if break is not applied then all the case after FAIL will be executed

            case NR: System.out.println("No Result!");
            break;
        }
    }
}