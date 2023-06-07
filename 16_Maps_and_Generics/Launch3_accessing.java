import java.util.*;
/* Accessing data:
There is no iterator method in Map
 * 4 method to access data:
 *      1- get(): method
 *      2- .keySet() method
 *      3- .values() method 
 *      4- entsrySet() method
 */

import java.util.HashMap;
import java.util.Map.Entry;

public class Launch3_accessing {
    public static void main(String[] args) {
        /*Creating HAshmap */
        HashMap hm = new HashMap();
        hm.put(01, "First");
        hm.put(02, "First");
        hm.put(02, "Second ");
        hm.put(03, "Third");
        hm.put(04, "forth");
        System.out.println(hm);

        /*.get() */
        System.out.println(hm.get(3));

        /*.keyset() */
        Set  keyset = hm.keySet(); //returns a Set of keys
        System.out.println("keys: "+keyset);;
        Iterator itr = keyset.iterator();
        while(itr.hasNext())
        {
            // System.out.println(itr.next());
            Integer key = (Integer) itr.next();  //downcasting set class to integer
            System.out.println(key);
        }

        /*.values() */
        Collection values = hm.values();
        System.out.println("values: "+values);
        Iterator itr2 = values.iterator();
        while(itr2.hasNext())
        {
            // System.out.println(itr2.next());
            String str = (String) itr2.next();
            System.out.println(str);
        }

        /*entrySet() */
        Set entryset = hm.entrySet();
        System.out.println("entrySet: "+entryset);
        Iterator itr3 = entryset.iterator();
        while(itr3.hasNext())
        {
            // System.out.println(itr3.next());
            Map.Entry data = (Entry)itr3.next();
            System.out.println(data.getKey()+":"+data.getValue());
        }
    }
}
