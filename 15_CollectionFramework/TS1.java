import java.util.TreeSet;
/**TreeSet: 
 * follows: Binary Search Tree
 * insertion order is not preserved
 * duplicates note allowed
 * data inserted in sorted order(using "Left value right/LVM" method)
 * TreeSet on initializing can be made heterogenous(with string and int )
 */
public class TS1 {
    public static void main(String[] args) {
        /*First TreeSet Object: */
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println("First TreeSet: "+ts);

        /*Tress set with heterogenous value but only when initializing */
        TreeSet ts2 = new TreeSet();
        ts2.add("asit"); //ca add heterogenous value but only on initializing
        ts2.add("50");
        // ts2.add(3.14);
        System.out.println(ts2);

        /*TreeSet with only float value */
        TreeSet ts3 = new TreeSet();
        ts3.add(2.46);
        ts3.add(3.33);
        ts3.add(1.34);
        System.out.println(ts3);

        /*higher and lower Methods: */
        System.out.println("****************************higher and lower method****************************");
        System.out.println("higher of 50: "+ts.higher(50));
        System.out.println("Lower of 50: "+ts.lower(50));
        System.out.println("higher of 40: "+ts.higher(40));
        System.out.println("lower of 40: "+ts.lower(40));
        
        /*ceiling and floor methods: Only Shows higher value if not present in list */
        System.out.println("****************************ceiling and floor method****************************");
        System.out.println("ceiling of 50: "+ts.ceiling(50));   //shows same no 
        System.out.println("floor of 50: "+ts.floor(50));       //shows same no.       
        System.out.println("ceiling of 40: "+ts.ceiling(40));   //works
        System.out.println("floor of 40: "+ts.floor(40));       //works(cuz 40 is not in treeset)
    }
}