import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Transient Keyword: 
 * Selective Serialization is achieved using selective keyword
 * Whichever data declared with transient keyword will not participate in serialization
 */
// class Student implements Serializable //
// {
//     private String name;
//     transient private int age;  //this data will not partiucipate in serialization cuz tansient data
//     private int id;

//     public Student(String name,int age, int id)
//     {
//         this.name = name;
//         this.age = age;
//         this.id = id;
//     }
//     public void disp()
//     {
//         System.out.println("This is: "+name+", he is "+age+"yr old. His rollno. is: "+id);
//     }
// }
public class Launch10_SelectiveSerialization {
    public static void main(String[] args) {
        // Student stu = new Student("Asit", 18, 23);
        // stu.disp();
        // try {
        //     FileOutputStream fos = new FileOutputStream("resources/selectiveSerialization.txt", false);
        //     BufferedOutputStream bos = new BufferedOutputStream(fos);
        //     ObjectOutputStream oos = new ObjectOutputStream(bos);
        //     oos.writeObject(stu);
        //     oos.flush();
        //     oos.close();
        // } catch (Exception e){
        //     System.out.println("something went wrong!!");
        // }

        try {
            FileInputStream fis = new FileInputStream("resources/selectiveSerialization.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois  = new ObjectInputStream(bis);

            Student stu2 = new Student("asit",25,91);
            stu2.disp();
        } catch (Exception e) {
            System.out.println("Something went wrong!!");
        }
    }
        
}