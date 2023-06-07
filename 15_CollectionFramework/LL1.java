import java.util.LinkedList;

/**Linked List 1: 
 * LinkList implements both ArrayList class and List interface So common inbuilt methods can be found apart from some specialized methods
 * LinkList follow "Doubly LinkedList Data-Structure"
 * Suitable for insertion type manipulation cuz no shifting and data is stroeed as nodes.
 * Duplicates are allowed
 * mentains insertion order
 * mentains insertion order
 */
public class LL1 {
    public static void main(String[] args) {

        /*Creating LinkedList object*/
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add("Asit"); //stores heterogenous data
        ll1.add(412.33);
        System.out.println(ll1);//order of insertion mentained

    
        LinkedList ll2=new LinkedList();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        System.out.println("ll2= "+ll2);

        /*add Fisrt and Last data */
        ll2.addFirst("Asit");
        ll2.addLast(2.36);
        System.out.println("First and Last data added: "+ll2);

        /*adding data at specific index */
        ll2.add(1, "Shastri");
        System.out.println("added data at index 1: "+ll2);

        /*peak() Method: Shows first data without removing it*/
        System.out.println("Peak at First data: "+ll2.peek());
        System.out.println("Peak at last data: "+ll2.peekLast());

        /*poll() Method: Shows first data and removes it from the list */
        Object a = ll2.poll(); //**imp**returns object cuz all collection framewors stroes data as objects
        System.out.println("poll() Method removed: "+a);
        System.out.println("ll2 after poll(): "+ll2);

        /*getting element from index*/
        System.out.println("get element in index 2: "+ll2.get(2));

        /*find index of an element*/
        System.out.println("Index of 'Asit': "+ll2.indexOf("Asit")); //-1 mean not in the list
        System.out.println("Index of 'Asit': "+ll2.indexOf("Shastri"));

        /*Last index of: if duplicate data is there */
        ll2.add(3,30);
        System.out.println("ll2= "+ll2);
        System.out.println("index of 30: "+ll2.indexOf(30));
        System.out.println("Last index of 30: "+ll2.lastIndexOf(30)); //this method shows last index if there are duplicate values
        
        /*Get first and last element */
        System.out.println("First element: "+ll2.getFirst()+" Last element: "+ll2.getLast());

        /*push() Method */
        ll2.push(11); //pushes 11 at the begining
        System.out.println("ll2 after pushing 11: "+ll2);

        /*pop() Method: pulls the recent pushed object */
        ll2.pop();
        System.out.println("pop: "+ll2);
        ll2.pop();
        System.out.println("pop again: "+ll2);




        
    }
}