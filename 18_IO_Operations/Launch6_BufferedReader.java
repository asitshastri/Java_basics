/**BufferedReader and FileReader
 * BufferedReader alongwith reading a file char by char, it can also read a file line by line. 
 */
import java.io.*;
public class Launch6_BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/thirdFile.txt");

        FileReader fr = new FileReader(file);  //imp: use try-cath to handle exception instead of throwing it. also put close() inside finally block.
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while(line!=null){
            System.out.println(line);

            /*updating line */ //so it does not read sameline data
            line = br.readLine(); //shifts cursor to next line and reads it
        }
    }
}