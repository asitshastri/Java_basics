import java.util.ArrayList;
import java.util.*;
/**
 * Iterator
 * can be used for all collection classes
 * 
 */
public class Iterator1 {
    public static void main(String[] args) {
        /*Making an ArrayList*/
        ArrayList al = new ArrayList();
        for(int i=10;i<50;i+=10)
        {
            al.add(i);
        }
        System.out.println(al);
        

        /*accessing using for-loop */
        System.out.println("accessing using for-Loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        /*accessing using For-each Loop */
        System.out.println("accessing using For-Each Loop");
        for(Object o:al) //cuz collection stores data as objects and for-each loop can be used for array and instances
        {
            System.out.println(o);
        }

        /*accessing using iterator */
        System.out.println("accessing using Iterator class");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}