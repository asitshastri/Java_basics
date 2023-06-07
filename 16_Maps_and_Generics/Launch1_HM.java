import java.util.HashMap;

/**HashMap
 * Use to store data as key-value pair
 * Each key-value pair is called as "Entry"
 * Key must be unique
 * Order of onsertion is not preserved
 */
public class Launch1_HM {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(01, "Asit");
        hm.put(02, "Chris");
        hm.put(03, "RDJ");
        hm.put(04, "RDJ"); //duplicate value  allowed
        System.out.println(hm);
        hm.put(05,"scarlet");
        hm.put(06,"prat"); //duplicate key not allowed last duplicate key value is considered
        hm.put(06,"rocket");
        hm.put(07,"Groot");
        System.out.println(hm);
    }
}