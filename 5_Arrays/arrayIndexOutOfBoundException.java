/**
 * arrayIndexOutOfBoundException
 */
public class arrayIndexOutOfBoundException {

    public static void main(String[] args) {
        System.out.println("ArrayIndexOutOfBoundsExceptions"); //prints

        int a[]=new int[4];
            a[0]=5;
            a[1]=2;
            a[2]=3;
            a[3]=6;
            // System.out.println(a[4]); //creates an exception 

            //to fetch last value always use
            System.out.println(a[a.length-1]);
            System.out.println("bye"); //Does not prints as execution breaks after the exception orrurs.
    }
}