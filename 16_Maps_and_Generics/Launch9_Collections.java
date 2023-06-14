/**
 * Collections
 * This collections class has certain inbuilt static methods for manipulating a collection like 
 *      sort()
 *      binarySearch()-  Binary Search can only be done for sorted collection
 *      rotate()
 *      shuffle()
 *      frequency()
 */
import java.util.*;
public class Launch9_Collections {
    public static void main(String[] args) {

        /*sort() */
        List<String> al1 = new ArrayList<String>();
        al1.add("Nick");
        al1.add("Steve");
        al1.add("Robert");
        al1.add("Thor");
        Collections.sort(al1);
        System.out.println(al1);

        /*binarySearch() */
        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(50);
        al2.add(150);
        al2.add(25);
        al2.add(75);
        al2.add(170);
        al2.add(125);
        Collections.sort(al2);
        System.out.println("Sorted list: "+al2);
        System.out.println("75 at: "+Collections.binarySearch(al2,75));

        /*rotate() */
        Collections.rotate(al2, 3);
        System.out.println("rotated al2 by 3: "+al2);

        /*shuffle() */
        Collections.shuffle(al2);
        System.out.println("shuffled al2: "+al2);

        /*frequency() */
        al2.add(100);
        al2.add(120);
        al2.add(100);
        System.out.println("al2 updated: "+al2);
        System.out.println("frequency of 100: "+Collections.frequency(al2, 100));
    }
}