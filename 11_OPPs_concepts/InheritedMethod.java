class Aeroplane{
    void takeoff()
    {
        System.out.println("Aeroplane Taking-off");
    }
    void fly()
    {
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    void carryFood()
    {
        System.out.println("Plane carries Food!");
    }
}
class passengerPlane extends Aeroplane
{
    void fly()  //Method Overriding: name and argument must be same but after java 1.4 return type need not be same.
    {
        System.out.println("Thsi plane is flying with passengers");
    }


    void carryPassengers()
    {
        System.out.println("this plane is carrying passengers!");
    }
}
public class InheritedMethod {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();  //Inherited method
        cp.fly();  //Inherited method
        cp.carryFood();  //Specialized method

        passengerPlane pp = new passengerPlane();
        pp.takeoff();  //Inherited method
        pp.fly();  //overriden method
        pp.carryPassengers(); //Specialized method
    }
    
}
