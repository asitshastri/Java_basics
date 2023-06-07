/**
 * AnonymouseInnerClass
 */
//@<statement>: tell us the intention with the code so using @FunctionalInterface gives error if  we add another method in the interface classs cuz lambda function works only for functional interface(that has only one abstract method)
@FunctionalInterface  
interface Car1{
    void Drive();
}

@FunctionalInterface
interface Car2{
    void Drive2(int a);
}
@FunctionalInterface
interface Car3{
    void Drive3(int a,String b);
}


public class AnonymouseInnerClass {

    public static void main(String[] args) {
        Car1 c1 = () -> System.out.println("Driving...");
        c1.Drive();

        /*------------------------------------------------------------------------------------------------------------ */
        Car2 c2 = new Car2() {
            public void Drive2(int a)
            {
                System.out.println("Driving.... at:"+a+"kmph");
            }
        };
        c2.Drive2(10);
        //implementing above using lambda
        Car2 c3 = (a) -> System.out.println("Driving.. at: "+a+"kmph");
        c3.Drive2(20);
        /*------------------------------------------------------------------------------------------------------------ */


        
        //implementing above using lambda
        Car3 c4 = (a,b) -> System.out.println(b+" is driving at "+a+"kmph");
        c4.Drive3(100, "asit");

    }
}