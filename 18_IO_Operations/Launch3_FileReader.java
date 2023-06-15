/**
 * Launch3_FileReader
 */
import java.io.*;
public class Launch3_FileReader {
    public static void main(String[] args) throws IOException{
        File file = new File("resources/secondFile.txt");
        // FileWriter fw = new FileWriter(file);

        FileReader fr = new FileReader(file);

        /*read() Method: return ascii value of all the character in the data */
        int i = fr.read();
        System.out.println((char)i);  //reads "A"
        i=fr.read();  //stores next char in i i.e reads next char
        System.out.println((char)i);  //reads "\n"
        i=fr.read();
        System.out.println((char)i);  //reads "a"


        /*reading all the data in a file */
        while(i!=-1) //end of the file is denoted by "-1"
        {
            System.out.print(i+"--->");
            System.out.println((char)i);
            i = fr.read();
        }
        



    }
}