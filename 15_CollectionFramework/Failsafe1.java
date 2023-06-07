import java.util.concurrent.*;
import java.util.*;
/**Failsafe
 * Used to ignore the concurrentModificationException When shown during Concurrent modification while iteration over a collection
 * use "Concurrent Class" in java.util.concurrent.*
 * Create collection object using Failsafe package class: CopyOnWrite<collection_name> <collection_reference> = new CopyOnWrite<collection_name>();
 * 
 * When collection data is accessd through for-loop with concurrent modification it goes into infinite loop
 * 
 * FailFast:
 *      When collection data is accessd through Iterator method with Concurrent modification it shows concurrentModificationException and program fails knowaws FailFast
 * 
 */
public class Failsafe1 {
    public static void main(String[] args) {
        /*Making an ArrayList*/
        ArrayList al = new ArrayList();
        for(int i=10;i<50;i+=10)
        {
            al.add(i);
        }
        System.out.println("al= "+al);

        // /*Example of infinite loop */
        // for(int i=0;i<al.size();i++)
        // {
        //     System.out.println(al.get(i));
        //     al.add(100);   //Concurrent Modification
        // }

        System.out.println("***********************************************");

        /*FailFast */
        
        System.out.println("FailFast Example");
        Iterator itr = al.iterator();
        try {
            while(itr.hasNext())
            {
            System.out.println(itr.next());
            al.add(100);  //Concurrent Modification
            }
        } catch (Exception e) {
            System.out.println("FailFast: "+e);
        }

        System.out.println("***********************************************");

        /*FailSafe */
        System.out.println("FailSafe Example");
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList<>();
        for(int i=20;i<60;i+=10)
        {
            al1.add(i);
        }
        System.out.println("al= "+al1);

        itr = al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            al1.add(100);
        }

    
    }
}