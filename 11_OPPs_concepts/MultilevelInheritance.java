class class1{
    void methodClass1()
    {
        System.out.println("Method1 of Class1");
    }
}
class class2 extends class1{
    void methodClass2()
    {
        System.out.println("Method2 of class2");
    }
}
class class3 extends class2
{
    void methodClass3()
    {
        System.out.println("Method3 of class3");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        class3 c3 = new class3();
        c3.methodClass3();
        c3.methodClass2();
        c3.methodClass3();
        
    }
}
