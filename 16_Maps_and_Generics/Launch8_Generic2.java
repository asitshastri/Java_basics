class Gen<A>{
    /*creating A d-type reference */
    A obj;
    
    /*cunstructor method that accepts above reference as argument */
    public Gen(A obj)
    {
        this.obj = obj;
    }
    void disp()
    {System.out.println("The type of data is: "+obj.getClass().getSimpleName());}

    /*method that returns obj reference */
    public A getobj()
    {
        return obj;
    }
    
}
public class Launch8_Generic2 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);
        g.disp();
        System.out.println(g.getobj());

        Gen<String> g1 = new Gen<String>("Asit");
        g1.disp();
        System.out.println(g1.getobj());
    }
}
