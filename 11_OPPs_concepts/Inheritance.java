/**
 * Inheritance
 */
class Parent{
    public void ParentMethod()
    {
        System.out.println("This is Parent Method");
    }
}
class Child extends Parent //"extend" keyword used to inherit Parent class properties in child class
{
    public void ChildMethod()
    {
        System.out.println("This is Child Method");
    }
}
public class Inherited_specalized_overriiden_Methods {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.ParentMethod();

        Child c = new Child();
        c.ChildMethod();
        c.ParentMethod(); //Parent Methods accessed by child class
        
    }
}