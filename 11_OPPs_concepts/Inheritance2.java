class Human{
    //private String name;
    int age;

    Human()
    {
        System.out.println("Human Class Constructor");
    }
    void sleep()
    {
        System.out.println("Humans needs good sleep");
        age = 18;
        System.out.println(age);
    }
}
class Student1 extends Human{
    Student1()
    {
        //super()      //as the default Student1 constructor contains super method which calls zero argument Parent class method 
    }
    void disp()
    {
        System.out.println("The age is: "+age);
        //System.out.println("The name is: "+name);  //error cuz name is private and does not participate in inheritance
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Student1 s= new Student1();  //WHy the human class constructor is executing even though a a Student1 class conctructor is called
        s.sleep();
        s.disp();
    }
}
