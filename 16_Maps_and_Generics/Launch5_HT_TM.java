import java.util.Hashtable;
import java.util.TreeMap;

/**HashTable
 *      no duplicate keys
 *      Order of insertion not preserved
 *      load factor = 0.75
 *      Not Thread Safe
 *      "null" value not allowed
 * TessMap
 *      order of insertion not preserved
 *      key in sorted order
 */
public class Launch5_HT_TM {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"asit");
        ht.put(2,"Shastri");
        ht.put(3,"Chris");
        System.out.println(ht);

        TreeMap tm = new TreeMap<>();
        tm.put("b","apple");
        tm.put("c","apple");
        tm.put("a","apple");
        System.out.println(tm);  //key in sorted order
    }
}