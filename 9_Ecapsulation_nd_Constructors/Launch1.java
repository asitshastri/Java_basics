/**Private Variable
 * They can only be accessed in the same class
 */
import java.util.Scanner;
class Student{

    private int age;
    private String name;

    public void setter()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eter your age: ");
        age = scan.nextInt();
        System.out.print("Enter 5your name: ");
        name = scan.next();
        scan.close();
    }
    public void getter()
    {
        System.out.println("name: "+name+", age: "+age);
    }

}
public class Launch1 {

    public static void main(String[] args) {
        System.out.println("print");
        Student obj = new Student();
        obj.setter();
        obj.getter();
    }
}