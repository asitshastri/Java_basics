/**
 * Launch1_Fundamentals
 */
import java.io.*;
public class Launch1_FileClass {
    public static void main(String[] args) throws IOException  /*checked Exception */
    {
        /*making directory if not exists */
        File dir  = new File("resources");  //object of File class 
        if(dir.exists()==false)
        {
            dir.mkdirs();
        }
        else{
            System.out.println(" Directory already exists");
        }
        System.out.println("dir is refering to Directory resources: "+dir.isDirectory());
        
        
        /*Creating txt file inside the directory */
        File file1 = new File("resources/firstFile.txt");
        while(file1.exists()==false)
        {
            file1.createNewFile();
        }
        System.out.println("File is reffering to firstFile.txt: "+file1.isFile());


        /*creating file inside a directory directly */
        File file2 = new File(dir,"secondFile.txt");
        if(file2.exists()==false)
        {
            file2.createNewFile();
        }
        else{
            System.out.println(file2.getName()+" already exists");
        }
        System.out.println("File is reffering to secondFile.txt: "+file2.isFile());

        /*Counting no of files inside a directory */
        int count = 0;
        File dir2 = new File("resources");
        //file3.list(): this method return String type Array of file names
        String filearr[] = dir2.list();
        for(String name:filearr)
        {
            count+=1;
            System.out.print("file"+count+" is: "+name+", ");
        }
        System.out.println();
        System.out.println("no. of files in the resources directory: "+count);


    }
        
}