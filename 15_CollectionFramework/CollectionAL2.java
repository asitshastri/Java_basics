import java.util.*;
public class CollectionAL2 {
    public static void main(String[] args) {
        
        //Creating Arraylist object using its Parent class
        List al1 = new ArrayList();

        for(int i=100; i<501; i+=100)
        {
            al1.add(i);
        }
        System.out.println(al1);

        //checking if ArrayList has perticular Data (o/p-  boolean)
        System.out.println("Does al1 has 200? "+al1.contains(200));

        // Checking index of a perticular Data
        System.out.println("index of 400? "+al1.indexOf(400));

        //size of Arraylist
        System.out.println("Size of ArrayList al1= "+al1.size());

        //setting/ensuring minimum capacity of al2(**imp** can only be use if parent class not used to create object)
        ArrayList al2 = new ArrayList<>();
        al2.ensureCapacity(10);
        System.out.println("al2 size= "+al2.size());
        al2.add(100);
        al2.add(300);
        al2.add(200);
        System.out.println(al2);
        al2.trimToSize();
        System.out.println("al2 size= "+al2.size());

        //clearing all data
        al2.clear();
        System.out.println("al2= "+al2);

        


    }
}

