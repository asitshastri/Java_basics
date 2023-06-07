class Student{
    private int a;
    private int b;

    // 
    public Student() //Zero argument constructor
    {
        System.out.println("Zero parametrized default constructor by programmer");
    }
    public Student(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Consctuctor with argument is called");
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Consjava {

    public static void main(String[] args) {
        System.out.println("Asit");
        //While creating an object a zero argument constructor called therefore java created a default zero argument constructor
        Student s = new Student(); //Student()- zero argument consructor
        s.disp();

        //Constructor with argument
        Student s2 = new Student(10,20);
        s2.disp();
    }
}