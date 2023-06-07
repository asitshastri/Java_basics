class CheckPangram{
    public void isPangram(String str1)
    {
        boolean ispan = false; //by default we assume it is a pangram
        str1 = str1.replace(" ", "");
        str1 = str1.toUpperCase();
        System.out.println(str1);
        char []strArr = str1.toCharArray();
        // System.out.println(str1.length());

        // creating an empty int array of size 26
        int ar[]= new int[26];

        for(int i=0;i<strArr.length;i++)
        {
            ar[strArr[i]-65]+= 1;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0){
                System.out.println();
                ispan = true;
            }
        }
        if(ispan==false)
        {
            System.out.println("It is a Pangram");
        }


    }
}
public class PangramChack {
    public static void main(String[] args) {
        String str1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        CheckPangram p = new CheckPangram();
        p.isPangram(str1);
    }
}
