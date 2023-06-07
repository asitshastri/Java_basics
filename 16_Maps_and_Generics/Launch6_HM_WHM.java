import java.util.HashMap;
import java.util.*;

/**HAshMap vs WeakHAshMap
 * 1- finilize method 
 */
class Employee{
    private String name;
    private int id;

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String toString()
    {
        return id+"";
    }

    @override
    public void finalize()  //this method is present inside object class and is called by Garbage Collector of cleaning action
    {
        System.out.println("clean up work by GarbageCollector before de-allocating memory from heap");
    }
}
public class Launch6_HM_WHM {
    public static void main(String[] args) {
        /*Object of Employee class */
        Employee e=new Employee("Hyder", 171);


        WeakHashMap hm=new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e=null;// eligible for garbage collection

        System.gc(); //invocking garbage collector

        System.out.println(hm);

        System.out.println("Last line");

    }
}