/**
 * StringBuffer_capacity
 */
public class StringBuffer_capacity {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("default Capacity: "+sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println("Capacity after appending abcdefghijklmnop: "+ sb.capacity());
        sb.append("q");
        System.out.println("if 17th char q is added then the capacity increases automatically to:(16+1)*2=34:  "+ sb.capacity());
        System.out.println("How many characters in sb: "+ sb.length());

        StringBuffer sb2 = new StringBuffer("asit");
        System.out.println("Capacity if default string is added while creating buffer= 16+no of char in string(16+4)= "+sb2.capacity());
        sb2.append("abcdefghijklmnopq");
        System.out.println("Now append Shastri to sb2 the capacity becomes:(20+1)*2= "+sb2.capacity());
    }
}