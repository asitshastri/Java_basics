import java.util.Arrays;
import java.util.Scanner;
public class anagramCheck {

    public static void main(String[] args) {
        String a="School Master";
        String b = "The Classroom";
        
        
        a=a.replace(" ", "");
        b=b.replace(" ", "");
        // System.out.println(a);
        // System.out.println(b);

        a=a.toLowerCase();
        b=b.toLowerCase();
        // System.out.println(a);
        // System.out.println(b);

        char []aArr = a.toCharArray();
        char []bArr = b.toCharArray();
        
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        if(Arrays.equals(aArr,bArr))
        {
            System.out.println("It is an Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}