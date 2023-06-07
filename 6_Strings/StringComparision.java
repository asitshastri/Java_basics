/*comparision methods:
 * 1)- s1==s2: compares the reference of s1 and s2
 * 2)- s1.equals(s2): conpares the value of both s1 and s2
 */
public class StringComparision {
    public static void main(String[] args) {

        /*compairing usin .equal() method */
        String s1="Asit";
        String s2 = new String("Asit");
        String s3 = new String("Asit");
        System.out.println(s1==s2); //false: cuz s1==s2 checke reference not the content. s1 refers to object inside heap while s2 refers to object inside SCP.
        System.out.println(s1.equals(s2)); //true

        if(s1.equals(s2)&&s2.equals(s3))
        {
            System.out.print("All s1,s2,s3 have same value: ");
            System.out.println(s1);
        }

        /*As Java is case sensative "asit","Asit","ASIT" all are different values */
        String s4 = new String("asit");
        String s5 = new String("Asit");
        String s6 = new String("ASIT");

        /*comparision by ignoring the case sensitivity */
        if(s4.equalsIgnoreCase(s5)||s5.equalsIgnoreCase(s6)||s6.equalsIgnoreCase(s4))
        {
          System.out.println("Asit,asit,ASIT are equal if we use .equalsIgnoreCase() method");  
        }

        /*comparision with case sensitivity */
        if(s4.equals(s5)||s5.equals(s6)||s6.equals(s4))
        {
            System.out.println("Asit,asit,ASIT are equal if we use .equals() method");
        }
        else
        {
            System.out.println("Asit,asit,ASIT are not equal if we use .equals() method");
        }
    }
    }

