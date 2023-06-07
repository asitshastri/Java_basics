class Student1{
    private String name;
    private int age;

    public Student1()
    {
        System.out.println("Default Constructor is called");
            
    }

    public Student1(String name)
    {
        this.name = name;
        age=19;
    }

    public Student1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.disp();

        Student1 s2 = new Student1("asit");
        s2.disp();

        Student1 s3 = new Student1("asit", 24);
        s3.disp();
    }
    
}
