import java.util.ArrayDeque;

/** ArrayDeque:  
 * This class implements Deque interface and Deque extends Queue interface so it contains bothd Deque and Queue interface's inbuilt methods
 * Index based accessing not allowed: can't access or add data based on index
 * Follows "Double ended queue Data-structure" : i.e inserction and deletion can be performed from both front and rare end.
 * dublicates are allowed
 * can store heterogenous type of data
 * 
 * 
 */
public class ADQ1 {
    public static void main(String[] args) {
        /*First ArrayDequeue object*/
        ArrayDeque adq1 = new ArrayDeque();

        /*add() Method: to add data */
        adq1.add(100);
        adq1.add(200);
        adq1.add(300);
        System.out.println("adq1= "+adq1);

        /*Inserting last and first data*/
        adq1.addFirst("Asit");      //index based insertion not allowed
        adq1.addLast("Shastri");   //So, can only add data in rare and front end

        /*can hold both homogenous and heterogenous data */
        System.out.println("adq1= "+adq1);

        /*Offer() Method: Data added using offer method might get added or not  */
        adq1.offer("Offer");
        adq1.offerLast("Last_Offer");
        adq1.offerFirst("First_Offer");
        System.out.println("adq1= "+adq1);
    }
}