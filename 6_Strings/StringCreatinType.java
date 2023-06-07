/**
 * StringCreatinType
 */
public class StringCreatinType {

    public static void main(String[] args) {
        /*Creating using normal method
         * Object will be created in String Constant Pool(SCP)
         * SCP does not allow Duplicates 
         * So any obj created will point to same memory location ans s1==s2-->True 
         */
        String s1 ="Asit";
        String s2="Asit";
        System.out.println(s1==s2);

        /*Creating String using "new" keyword'
         * Objects created using new keyword will be created inside heap and scp be but the varible will only refer to heap area where duplicates are allowed.
         * and even if the value of the different object are same they will be stored in diffeerent obj memory location
         * s3==s4--> false
         */
        String s3 = new String("Asit");
        String s4 = new String("Asit");
        System.out.println(s3==s4); //flase cuzz both s3 and s4 are stored in different memory locations
    }
}