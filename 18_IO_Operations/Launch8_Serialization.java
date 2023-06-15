import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serialization: Storeing data in a file in a secured way
 * 
 * Q-Which classes are used to store Binary type of data?
 * ans: To read/write Binary type od data one we use "InputStream" and "OutputStream" classes
 */
class Student implements Serializable //
{
    private String name;
    private int age;
    private int id;

    public Student(String name,int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void disp()
    {
        System.out.println("This is: "+name+", he is "+age+"yr old. His rollno. is: "+id);
    }
}
public class Launch8_Serialization {
    public static void main(String[] args) throws Exception
    {
        Student stu = new Student("Asit", 18, 23);
        stu.disp();

        // /*No need for creating file to store searilized data */

        /*Serializing above object */
        /*using "FileOutputStream" to convert object data to byte code */
        FileOutputStream fos = new FileOutputStream("resources/serializedFile.txt"); //automatically creates a file if not exists

        /*using "BufferedOutpputStream" to make process more efficient */
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        /*using "ObjectOutputStream" to store this byte code into a file */
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        /*method to write into a file */
        oos.writeObject(stu);

        /*closing the resource */
        oos.flush();
        oos.close();

    }
}