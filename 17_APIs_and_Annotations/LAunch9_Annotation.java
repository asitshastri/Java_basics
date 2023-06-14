/**Annotation: (import java.lang.annotation.Annotation;)
 * Whenever we want a code's information to reach a developer as well as the compiler(JVM) Annotations are used
 *      example: @override is used to describe a method which overides a parent class method, using this it shows erroe if method name is wrong.
 * 
 * Pre-defined Annotations:=
 *      @Override: used to describe a method which overides a parent class method
 *      @FunctionalInterface: Functional Interface is an interface with only one abstract method, This annotation only one abstract class
 *      @Deprecated: Depricated class is a class which is nolonger in use
 */
@FunctionalInterface
interface Demo
{
    void disp();
    //void disp2();
}

//this is parent class 

@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
   
}

//this is child class or subclass
class CargoPlane extends Plane
{
    //overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");

    }

    public void specificMethod()
    {
        System.out.println("Child specific method");
    }
    
}

public class LAunch9_Annotation {
    public static void main(String[] args) {
        System.out.println("ANNOTATOINS");

        /*Object of child class */
        Plane cp = new CargoPlane();
        cp.planeFliesAtGoodHeight();

        // cp.specificMethod(); //This method not available due to Loose Coupling
        /*Loose Coupling:
         * When parent class type reference is used to create chils class object then it is called loose coupling because
         * only knowledge one class has about the other class is what the other class has exposed through its interfaces in loose coupling i.e the reference will not show and specific methods inside child class
         */
    }
}