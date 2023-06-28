import java.util.ArrayList;
import java.util.function.Consumer;
@FunctionalInterface
interface interface1{
    void disp();
}
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

        //Using functional interface to access above functional interface
        interface1 it1 = ()-> System.out.println("display method inside interface1");
        it1.disp();
    }
    
}