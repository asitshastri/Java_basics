
class A
{
    //Address addre;  //addes the above Address class in this class
    class Address{
        String Address;
        String Pincode;
    }
    public void show()
    {

        System.out.println("in A show");
    }
    static class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}


public class InnerClassDemo {
    public static void main(String[] args) {
        A obj2 = new A();
        obj2.show();
       

        A.B obj1 = new A.B();
        obj1.display();

        //Accessing Addressclass inside A
        // A.Address obj3 = new obj2.Address();
        // System.out.println(obj3.Address);
    }
    }

