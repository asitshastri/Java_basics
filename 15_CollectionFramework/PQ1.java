import java.util.PriorityQueue;

/**PriorityQueue: 
 * This class implements Queue interface.
 * follows: "Minimun Heap Data-Structure"
 * Order of insertion is not preserved. stores data bsed on "Complete Binary Tree(CBT)."
 * duplicates are allowed 
 * only hopmogenous number data is allowed
 * "null" type of data is also not allowed
 */
public class PQ1 {
    public static void main(String[] args) {
        /*First PriorityQueue Object */
        PriorityQueue pq = new PriorityQueue<>();

        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println("pq= "+pq);

        /*duplicates are allowed */
        pq.add(50);
        System.out.println("Duplicate 50 added: pq= "+pq);

        /*try to add heterogenous data */
        try{
            pq.add("asit");
            System.out.println("asit added: "+pq);
        }
        catch(Exception e)
        {
            System.out.println("Can't give heterogenous value to PriorityQueue");
        }

    }
}