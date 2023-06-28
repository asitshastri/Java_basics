import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Iterator;
@FunctionalInterface
interface interface1{
    void disp();
}
interface interface2{
    void disp2(int a, String b);
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

        interface2 it2 = (a,b)->System.out.println(a+" "+b);
        it2.disp2(10, "string");
        //or another way using new keyword
        interface2 it3 = new interface2() {
            public void disp2(int a,String b)  //public added cuz by default interface methods are public and abstract.
            {
                System.out.println(a+b);
            }
        };
        it3.disp2(10, "string");
    }
    
}