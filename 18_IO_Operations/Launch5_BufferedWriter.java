/**BufferedWriter and FileWriter
 * Can we read all the daa togeather instead of character by character reading?
 * BufferedWriter alongside FileWriter is used for more efficient and faster reading.
 * 
 * Analogy: Think of FileWriter as a pipe the transfers water(data) b/w file and the ram, So Buffered Writer is like a motor the increases the flow rate of data insie the file
 */
import java.io.*;
public class Launch5_BufferedWriter {
    public static void main(String[] args) throws IOException{
        File file = new File("resources/thirdFile.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'a','s','d','r','t'};
        bw.write(ch);
        bw.newLine();

        bw.flush(); //only close() is enough but, flush method ensures data is saved first before closing the writer.
        bw.close();


    }
}