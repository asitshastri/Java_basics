/**FileWriter:
 * default nature: Overriding
 * to append data:
 *      pass true with Filewriter i.e:  FileWriter fw = new FileWriter("resources/secondFile.txt");
 * 
 * Q- Why data is not added if FileWriter object is not cosed?
 * ans- While writing FileWriter stores the data inside a buffer location anf is the close()/flush() statement is not executed then this writer does not adds the data as it is excepting more data to come cuz writer is not closed. If the close()/flush() statment is executed then Writer is sure that no more data is coming so its stored the data in a file.
 * 
 * Q- What is an alternate method of fw.close?
 * ans: flush() Method: is an alternate, This method can be used to add data without closing the Writer ,but it is good practice to prefer close() method.
 */
import java.io.*;
public class Launch2_FileWriter
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("resources/secondFile.txt");
        FileWriter fw = new FileWriter(file,true);  //this true allows file nature to change to appending from overriding(false)

        fw.write(65); //stroes "A"
        fw.write("\n");
        fw.write(97); //stores "a"

        fw.write("\n");

        char ch[] = {'j','c','d','b'};
        fw.write(ch);
        fw.write("\n");

        fw.flush();  //until the file is closed the data will not be stored in the file

        // fw.write("..\n");
        fw.write(99);
        fw.close();
        System.out.println("Open resources/secondFile.txt to see result");

    }
}