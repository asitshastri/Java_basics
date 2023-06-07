import java.util.*;
/**
 * ListIterator
 * It can only be used on List interface child class collections(ArrayList and LinkedList)
 */
public class ListIterator1 {
    public static void main(String[] args) {
        /*Making an ArrayList*/
        ArrayList al = new ArrayList();
        for(int i=10;i<50;i+=10)
        {
            al.add(i);
        }
        System.out.println("al= "+al);

        /*accesing in reverse order using ListIterator */
        System.out.println("Reverse order");
        ListIterator litr = al.listIterator(al.size());  //moves the cursor to the end
        while(litr.hasPrevious())    
        {
            System.out.println(litr.previous());
        }

        /*accessing from perticular index */
        System.out.println("accessing from index:1");
        litr = al.listIterator(1);
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
    }
}