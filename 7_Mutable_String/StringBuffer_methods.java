/*StringBuffer methods:
 * 0)- length()
 * 1)- capacity()
 * 2)- charAt(int index)
 * 3)- setCharAt(int index,char ch)
 * 4)-append()
 *      4.1)- append(String s)
 *      4.2)- append(int i)
 *      4.3)- append(long l)
 *      4.4)- append(boolean b)
 *      4.5)- append(double d)
 *      4.6)- append(float f)
 *      4.7)- append(int index,Object o)
 * 5)- Overloaded methods
 *      5.1)- insert(int index,String s)
 *      5.2)- insert(int index,int i)
 *      5.3)- insert(int index,long l)
 *      5.4)- insert(int index,double d)
 *      5.5)- insert(int index,float s)
 *      5.6)- insert(int index,boolean b)
 *      5.7)- insert(int index,Object o)
 * 6)- .reverse()
 * 7)- trimToSize()
 */
public class StringBuffer_methods {
    public static void main(String[] args) {
        // length()
        StringBuffer sb = new StringBuffer("Asit");
        System.out.println("String length:"+ sb.length());

        //capacity()
        System.out.println("Capacity method: "+sb.capacity());

        //charAt()
        System.out.println("charAt(0): "+sb.charAt(0));

        //setChatAt(index,char)
        // it is a method whoes return type is void so no need of printing it
        sb.setCharAt(0, 'a');
        System.out.println("setCharAt(0,'a'): "+sb);

        //append()
        sb.append(" shastri");
        System.out.println("sb.append( shastri): "+ sb);

        //trimToSize()
        StringBuffer sb2 = new StringBuffer(150);
        System.out.println("sb2 given capacity: "+sb2.capacity());
        sb2.append("Asit Shastri");
        System.out.println("appending my name inside sb2: "+ sb2);
        System.out.println("capacity after appending my name: "+sb2.capacity());
        sb2.trimToSize();
        System.out.println("using trimToSize to fit "+sb2.capacity());


        
    }
}


