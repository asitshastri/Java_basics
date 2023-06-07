import java.util.*;
/**
 * Collection1: Arraylist Class
 * Array list is suitable for adding data at the rare end of the list
 * Using Arraylist we can add data at a specific index but it is not advisable Use: LinkedList for such purpose
 * Duplicates are allowed
 * mentains insertion order
 * mentains insertion order
 */

public class CollectionAL1 {
    public static void main(String[] args) {
        //creating Arraylist object
        ArrayList al1 = new ArrayList<>();

        //adding adata to ArrayList
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);


        //creating another Arraylist
        ArrayList al2 = new ArrayList<>();

        //adding heterogenous data
        al2.add("asit");
        al2.add(100);
        al2.add('q');
        al2.add(20.213);
        System.out.println(al2);


        /*Adding one collection to another collection */
        al1.addAll(al2);
        System.out.println(al1);

        //adding data at a specific location
        al1.add(4,"Shastri");
        System.out.println(al1);

        //adding a Arraylist inside a Arraylist into a specific index
        ArrayList al3 = new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);

        al1.add(5,al3);
        System.out.println(al1);
    }
}