import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Lambda_expression_forEach
 */
public class Lambda_expression_forEach {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        al.forEach((n)->System.out.println(n));

        //or
        //consumer class stores the lambda expression 
        Consumer<Integer> method = (n)->System.out.println(n);
        al.forEach(method);
    }
    
}