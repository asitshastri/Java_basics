import java.util.*;
import java.util.Map.Entry;
/*toString() Method 
 * This method is present inside the Object class in java and returns the reference of the object in hexCode: "<class_name>@<hexCode>"
 * When System.out.println() method is ececuted it calls for the toString() methood So in order to get the desired value we have to override this method
 */
class Student{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    /*Overriding toString() method */
    public String toString()
    {
        return this.name+" "+this.age+" "+this.city;
    }
}
public class Launch4_Hm {
    public static void main(String[] args) {
        /*Creating Student objects */
        Student st1 = new Student(" Asit", 24, "Delhi");
        Student st2 = new Student(" Chris", 42, "Delhi");
        Student st3 = new Student(" Robert", 49, "Delhi");

        /*Stroring above objects in a map */
        HashMap map = new HashMap();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        System.out.println("toString() not overridden: "+map);

        /*accessing HashMap using entrySetmethod and iterator*/
        Set set1 = map.entrySet();
        Iterator itr = set1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        /*accessing by MAp.entry class */
        Set set2 = map.entrySet();
        Iterator itr2 = set2.iterator();
        while(itr2.hasNext())
        {
            /*downcasting to Map.entry class from Object*/
            Map.Entry data = (Entry)itr2.next();
            System.out.println(data.getKey()+": "+data.getValue());
        }
        System.out.println();
        
    }
}
