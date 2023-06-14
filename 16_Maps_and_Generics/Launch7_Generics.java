import java.util.ArrayList;
import java.util.Collection;

/**
 * Launch7_Generics
 */
public class Launch7_Generics {
    public static void main(String[] args) {
        /*Typesaftey Example */
        String arr[] = new String[5];
        arr[0] = "asit";
        arr[1] = "asit";
        arr[2] = "asit";
        arr[3] = "asit";
        //tring d-type is already defines//arr[4] = 10; //can't be done cuz arry arr is type-safe as S
        for(String a:arr)
        {
            System.out.println(a);
        }


        /*type unsafe example */
        ArrayList al = new ArrayList();
        al.add("Asit");
        al.add(10);
        String n1 = (String)al.get(0);  //type downcasting from Object to String class
        int n2 = (int)al.get(1);        //type downcasting from Object to Integer class
        // String n3 = (String)al.get(1); //this does not gives an exception at compilation time but "ClassCastException" occurs at runtime this RunTimeException is a very big problem for a programmers.
        System.out.println(n1);
        System.out.println(n2);


        /*Generics: used when only one type of data must be passed through a collection
         * This concept is used to solve the above RuntimeException. Genegics avoid RunTimeException and give show then in compile time.
         * No type-Casting/Down-Casting needed in case of storing collection data in a variable
         */
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("asit");
        // al1.add(10;) //shwos exception cuz only String vlues are allowed
        al1.add("Shastri");

        String s1 = al1.get(1);
        System.out.println(s1);


        /*Generic type in left must be same as generic type in right */
        ArrayList<String> l1 = new ArrayList<String>();
        Collection<Integer> l2 = new ArrayList<Integer>(); 

        /*int,float,double etc. generic d-type are not allowed
         * ex: List<int> l3 = new ArrayList<int>();             -Not Allowed
         * ex: List<Integer> l3 = new ArrayList<Integer>();     -Allowed
         */

    }
}