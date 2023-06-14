import java.util.*;
import java.util.stream.*;
/**Stream-API: 
 * It is sub-Package of util package
 * released in java 1.8
 * any task or processing performed on a data using stream API. 
 * A seperate stream of the data is created and the task is carried out on that seperate stream.
 * 
 * Q1)-Whats is the advantage os using seperate stream?
 * Suppose we want to make changes to a list data and we want thata data to be immutable(i.e it must not change), Then is such cases we create a stream of that data and once that stream is consumed/used then no further cunsumption of stream is
 * 
 */
public class Launch4_StreamAPI {
    public static void main(String[] args) {
        /*Creating an ArrayList */
        List<Integer> lst = Arrays.asList(2,4,5,7,8,10);
        // lst.forEach(i->System.out.println(i));

        /*Creating seperate stream for the above lst data. */
        System.out.println("Task-1: with streamData");
        Stream<Integer> streamData = lst.stream(); //lst.stream() returns Stream type of data

        /*Manipulating above Stream data */
        streamData.forEach(n->System.out.println(n));
        try {
            streamData.forEach(n->System.out.println(n));
        } catch (Exception e) {
            System.out.println("No further consumption of same stream is allowed");
        }

        /*Ccount: streamData2 for counting */
        Stream<Integer> streamData2 = lst.stream();
        long count = streamData2.count();
        System.out.println("Task-2: with streamData2");
        System.out.println("count using streamData2: "+count);


        /*Sort: streamData3 for sorting */
        Stream<Integer> streamData3 = lst.stream();
        Stream<Integer> sortedstream = streamData3.sorted(); //streamData3 stored by sortedstream
        System.out.println("Iterating over sorted stream data using for each");
        // sortedstream.forEach(n->System.out.println(n)); // if this is executed the below string double operation will not work

        /*filter() Method */
        Stream<Integer> streamfilter = sortedstream.filter(n->n%2==0); //takes inbuilt Predicate inferace's implementation as argument
        //sortedstream stored by streamfilter.

        System.out.println("Filtering, Sorting and Mapping:");
        
        /*map() Method:
         * any operation(addition, substraction, insertion, deletion) can be done using map method.
         * This methods expects "Function" interface's implementation as argument
         */
        Stream<Integer> streamdouble = streamfilter.map(n->n*2); //streamfilter stored by streamdouble/
        streamdouble.forEach(i->System.out.println(i)); //streamdouble now consumed and can't be used again.
        /*Q)- What is a Functional Interface?
         * A Function Interface is a interface class with only one abstract class. and its implementation can be given in a normal class or by anonymous inner class or through a lambda function.
         */

        /*Method Chaining
        * If the return type of different methods are same then we can chain then togeather
        Syntax: x.method1().method().method3().......
        */
        System.out.println("Filtering, sorting and Mapping using Method Chaining: ");
        Stream<Integer> streamData4 = lst.stream();
        Stream<Integer> finalsStream = streamData4.filter(n->n%2==0).sorted().map(n->n*2);
        
        finalsStream.forEach(n->System.out.println(n));
        
    }
}