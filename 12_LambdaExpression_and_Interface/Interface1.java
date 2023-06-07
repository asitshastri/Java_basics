/**
 * Interface
 * An interface is a completely "abstract class
 * the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
 * Multiple Inheritance is possible in case of interface.
 * 
 */
interface FirstInterface {
    void myMethod(); // interface method
}

interface SecondInterface {
    void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
public void myMethod() {
    System.out.println("Some text..");
}
public void myOtherMethod() {
    System.out.println("Some other text...");
}
}
 public class Interface1 {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
