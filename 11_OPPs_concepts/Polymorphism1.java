class AeroPlane1
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }  
}
class PassengerPlane1 extends AeroPlane1
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
/**
 * Polymorphism
 *      Static Polymorphism:  If polymorphism exists at compilation time. 
 *                              ex: Method Overloading(Same method with different parameters)
 *      Dynamic Polymorphism: If polymorphism exists at runtime. 
 *                              ex: Method Overriding
 */
public class Polymorphism1 {

    public static void main(String[] args) {

        // 
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp=new PassengerPlane1();

        AeroPlane1 ref; //Parent type reference varible can hold the above refeerences
        //PassengerPlane1 ref; can not hold the reference because only Parent type class can hold the object reference

        ref = cp;
        ref.takeOff();
        ref.fly();

        ref = pp;
        ref.takeOff();
        ref.fly();
        
        //from this we get output from same reference variable this is called runtime Polymorphism achieved from method-overriding

        
    }
}