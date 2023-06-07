/**Code Execution Hierarchy
 * ststic variable
 * ststic block
 * ststic method (ex: main method)
 * non-static instance/variable
 * non-static block
 * non-static method
 */
public class Static_execution {

    static int age;
    static{
        age = 10;
        System.out.println("Static Block Executes First");
    }
    static void disp() //only executes when called for
    {
        System.out.println("static display method");
    }
    public static void main(String[] args) //called automatically by jvm
    {
        System.out.println("static Main method Block");
        disp();
    }
}