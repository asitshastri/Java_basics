import java.util.*;
import java.util.function.Consumer;

public class Launch3_FoeEachLoop {
    public static void main(String[] args) {
        /*ArrayList of integers */
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(8);
        list1.add(9);
        System.out.println(list1.getClass().getSimpleName()+": "+list1);


        /*ArryaList creation without using constructor  */
        List<Integer> list2 = Arrays.asList(2,4,5,8,9); //using array class instead of 
        System.out.println(list2.getClass().getSimpleName()+": "+list2);

        /*accessing without using forEach method */
        System.out.println("***************************************************************************************************************************");
        System.out.println("list2 elements accessed without using forEach method");
        for(Integer i:list2)
        {
            System.out.println(i);
        }
        System.out.println("***************************************************************************************************************************");

        /*forEach Method: forEach Method requires implementstion of counsumer interface*/
        System.out.println("accessing list2 element using forEach() method");
        System.out.println("Example-1: ");
        Consumer<Integer> cons = new Consumer<Integer>() //Consumer is an in-built interface created in java 
        {
            @Override
            public void accept(Integer i) //overriding accept() method
            {
                System.out.println(i);
            }
        };
        list2.forEach(cons); //This forEach method iterate over each element and expects inplementation of accept method in cunsumer interface
        System.out.println("*************************************************************");

        System.out.println("Example-2: Giving implementation using lambda expression");
        Consumer<Integer> cons2 = (Integer i)->System.out.println(i); //Consumer is an in-built interface created in java 
        list2.forEach(cons2);
        System.out.println("*************************************************************");

        System.out.println("Example-3: Giving direct implementations without creating object");
        list2.forEach((Integer i)-> System.out.println(i));

        System.out.println("***************************************************************************************************************************");
        


    }
}
