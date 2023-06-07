import java.util.*;

/**
 * Test1
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for(int i=10;i<50;i+=10)
        {
            al.add(i);
        }
        System.out.println(al);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    
    }
}