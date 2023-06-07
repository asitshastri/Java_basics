/* Linked Hash Map
 * Order of insertion is preserved
 */

import java.util.LinkedHashMap;

public class Launch2_LHM {
   public static void main(String[] args) {
    System.out.println("p");
    LinkedHashMap lhm = new LinkedHashMap<>();
    lhm.put(01, "First");
    lhm.put(02, "First");
    lhm.put(02, "Second ");
    lhm.put(03, "Third");
    lhm.put(04, "forth");
    System.out.println(lhm);
   } 
}
