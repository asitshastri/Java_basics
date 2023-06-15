/**
 * Launch7_PrintWriter
 * for adding boolean/float/double/int type of data into a file we can't use BufferedWriter and FileWriter
 */
import java.io.*;
public class Launch7_PrintWriter {
    public static void main(String[] args) throws IOException{
        File file = new File("fourthFile.txt");

        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);   //store char with ascii value 97
        pw.write("\n"); //add next line


        /*use pw.print() and pw.println() methods */
        pw.println("This is a println method inside PrintWriter class");
        pw.println(100);    //int value
        pw.println('a');    //char value
        pw.println(50.5);   //float value
        pw.println(true);   //boolean value

        pw.close();


    }        

}