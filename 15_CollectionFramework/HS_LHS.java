import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Hash Set and Linked Hash Set
 * HashSet class implemens Set interface
 *      introduced in java 1.2
 * LinkedHashSet extends Hashset class
 *      introduced in java 1.4
 */
public class HS_LHS {
    public static void main(String[] args) {
        /*Fisrt HashSet Object */
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(50);
        hs.add(500);
        System.out.println("First HashSet: "+hs);

        /*First LinkedHashSet */
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(75);
        lhs.add(125);
        lhs.add(50);
        lhs.add(500);
        System.out.println("First LinkedHashSet"+lhs);

    }
}