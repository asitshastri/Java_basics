/**
 * Launch4_FileReader
 */
import java.io.*;
public class Launch4_FileReader {
    public static void main(String[] args) throws IOException{
        /*writing read() for every char element in a large dataset is a tedious work
         * To prevent this we can input a character array inside the read() method as an argument
         */
        File file = new File("resources/secondFile.txt");

        FileReader fr = new FileReader(file);

        /*creating char array to input a argument */
        char arr[] = new char[(int)file.length()];

        fr.read(arr); //reads every data and stores it inside arr array
        for(char data:arr)
        {
            System.out.println(data);
        }
    }
}