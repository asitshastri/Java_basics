import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * Launch9_Deserialization
 */
public class Launch9_Deserialization {
    public static void main(String[] args) throws IOException
    {
        /*using "FileInputStream" to bring the byte code stored in a file to come to heap area */
        FileInputStream fis = new FileInputStream("resources/serializedFile.txt");

        /*using "BufferedInputStream" to increase process efficiency */
        BufferedInputStream bis = new BufferedInputStream(fis);

        /*using "ObjectInputStream" to convert the byte data into an object */
        ObjectInputStream ois  = new ObjectInputStream(bis);

        /*accessing the object with same class name give when serialized */
        Student stu1 = new Student("asit", 26,19);
        stu1.disp();

    }
}