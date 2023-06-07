class demo{
    static void disp1()
    {
        System.out.println("Static method does not require object creation");
    }
    
    void disp2()
    {
        System.out.println("Non-Static method requires object creation for calling");
    }
    static void disp3()
    {
        System.out.println("Static method Can also be called by object creation");
    }
}

class demo2{
    static int a;
    static int b;

    int m;
    int n;

    static{
        a=10;
        b=20;
        System.out.println("Control in Static Block");
    }
    {
        m=100;
        n=200;
        System.out.println("Control on Non-static Block");
    }

    static void disp4()
    {
        System.out.println("Value of static var:"+a);
        System.out.println("Value of static var:"+b);
    }
    
    void disp5()
    {
        System.out.println("Value of non-static var"+m);
        System.out.println("Value of non-static var"+n);
    }
}

public class Static_noObjectCreation {

    public static void main(String[] args) {
        demo.disp1();
        demo dm = new demo();
        dm.disp2();
        dm.disp3();



        // Executing static variable and method without object creation
        System.out.println(demo2.a);
        System.out.println(demo2.b);
        demo2.disp4();

        // Executing non-static variable and method with object creation
        demo2 dm2 = new demo2();
        dm2.disp4();
        System.out.println(dm2.m);
        System.out.println(dm2.n);
    }
}