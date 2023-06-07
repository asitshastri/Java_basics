/**this() method is used for class a constructor of same class. 
 * This method must be in 1st line
*/
class Student1{
    private String name;
    private int age;

    public Student1()
    {
        //default super() method will not be included if this method is present in a constructor.
        this("asit", 18); //this is used to shift the execution to constructor with one string argument
        System.out.println("Default Constructor is called");
            
    }

    public Student1(String name)
    {
        //default super() method will not be included if this method is present in a constructor.
        this();
        this.name = name;
        age=19;
    }

    public Student1(String name, int age)
    {
        //default super() method.
        //super();
        this.name = name;
        this.age = age;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class ThisVsSuperMethod {
    public static void main(String[] args) {
        System.out.println("this() vs super() Methods");

        Student1 s1 = new Student1(); //calls constructor with zero argument
        s1.disp();

        Student1 s2 = new Student1("asit");
        s2.disp();
    }
}
