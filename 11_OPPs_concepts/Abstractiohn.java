/**Abstract Class:
 * 1- Abstract class reference can be created and used to implement methods of its child classes
 * 2- An abstract class must have atleast one abstract method
 * 3- No Object Creation: Object creation of abstract class is not possible.
 * 4- Abstract Method: Any method that has no body, implementation and have method signature only, in java such methods are called Abstract methods.
 *                      ex: abstract public void method(){}
 * 5- No abstract Variable
 * 6- No abstract constructor
 * 7- Downcasting: as Parent class can not access the child class's specialized method so downcastin is done to Parent type reference variable in order to access child class method
 *                  SYNTAX:     ParentClass ref = new ChildClassConstructor();
 *                              ((ChildClassConstructor) ref).SpecializedMethod;
 */

 abstract class AeroPlane3
 {
     //abstract int age;
     
    abstract public void takeOff();
 
     abstract public void fly();
 
     public void landing()
     {
         System.out.println("Aeroplane is landing");
     }
 }
 class CargoPlane3 extends AeroPlane3
 {
     public void takeOff()
     {
         System.out.println("CargoPlane requires longer runway");
     }
    public void fly()
    {
     System.out.println("Cargoplane flies at lower height");
    } 
    public void alert()
    {
     System.out.println("Alert..");
    } 
 } 
 class PassengerPlane3 extends AeroPlane3
 {
     public void takeOff()
     {
         System.out.println("PassengerPlane requires medium size runway");
     }
     public void fly()
     {
     System.out.println("PassengerPlane flies at medium height");
     }
 }
 public class Abstractiohn {
    public static void main(String[] args) {
        System.out.println("Abstract Class:");
        System.out.println("    Abstract class reference can be created and used to implement methods of its child classes");
        System.out.println("    An abstract class must have atleast one abstract method");
        System.out.println("    No Object Creation: Object creation of abstract class is not possible.");

        AeroPlane3 ref1=new CargoPlane3(); //parent type reference holding child class object
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane3) ref1).alert(); //Downcasting Parent class reference to child class in order to implement Child class specialized method.

        AeroPlane3 ref3=new PassengerPlane3(); //parent type reference holding child class object
        ref3.takeOff();
        ref3.fly();
        ref3.landing();
    }
}