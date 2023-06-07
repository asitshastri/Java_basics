class Demo1{
    // int a,b;
    public Demo1()
    {
        System.out.println("Parent Class Constructor");
    }
    public Demo1(int x , int y)
    {
        System.out.println("Parametarized Parent Class Constructor");
        // a=x;
        // b=y;
    }
}
class Demo2 extends Demo1{
    // int m,n;
    public Demo2()
    {
        super(10, 20);
        System.out.println("Child Class Constructor");
    }
    public Demo2(int a)
    {
        this(10,20);
        
        System.out.println("This method pointing to Constructor in same class and replaces super()");
        
    }
    public Demo2(int x, int y)
    {
        // supe() by default which refers to zero argument parent constructor
        System.out.println("Parametarized Child Class Constructor");
        // m=x;
        // n=y;
    }
}
public class ConstructorExe {
    public static void main(String[] args) {
        Demo2 d=new Demo2();

        Demo2 d2 = new Demo2(10,20);

        Demo2 d3 = new Demo2(10);
        
    }
}
