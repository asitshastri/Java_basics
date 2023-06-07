/**
 * ternary_operator
 */
public class ternary_operator {

    public static void main(String[] args) {
        int a,b;
        a=30;    
        b=20;

        System.out.println((a<b)?"a is less":"b is less"); //no need to define the datatype for direct printing
        
        String res = (a<b)?"a is less":"b is less";
        System.out.println(res);

        // Nester ternary operation
        int c=10;
        int res2 = (a<b)? (a<c? a:b): (b<c? b:c);
        System.out.println(res2);
    }
}