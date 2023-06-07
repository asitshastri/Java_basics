/**
 * LogicalOps
 */
public class LogicalOps {

    public static void main(String[] args) {
        int a=10,b=10,c=30;
        System.out.println(a==b && a<b && a<c);
        System.out.println(a<b && a<a && b<c && a<=c);
        System.out.println(a==b || a<b || a>b);
        System.out.println(!true);
    }
}