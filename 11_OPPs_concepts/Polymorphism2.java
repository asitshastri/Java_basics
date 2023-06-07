class AeroPlane2
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

class CargoPlane2 extends AeroPlane2
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


class PassengerPlane2 extends AeroPlane2
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


class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
    System.out.println("FighterPlane flies at high height");
    }
}

class Airport
{
    public void poly(AeroPlane2 ref)
    {
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------------");
    }
}
/**
 * Polymorphism2
 */
public class Polymorphism2 {

    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        PassengerPlane2 pp=new PassengerPlane2();
        FighterPlane2 fp=new FighterPlane2();

        //creating Parent class object holding references of above objects ang giving diff. result based on diff references
        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}