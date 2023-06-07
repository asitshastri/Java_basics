/**
 * array1
 */
public class array1 {

    public static void main(String[] args) {
        /** Creating Array: Shortcut
         * Use only vwhen you know all the values to put*/
        int []a = {1,20,3,40,5,60,7,80,9};
        System.out.println(a.length); 
        System.out.println(a[0]);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            System.out.print("  ");
        }
        /*Strin Array */
        String names[]={"asit","Harsh","Kiran"};
        System.out.println(" ");
        System.out.println(" ");
        for(int i=0;i<names.length;i++)
        {
            System.out.print(names[i]);
            System.out.print(" ");
        }
        /** Creating Array: using "new" keyword
         * use this if you don't know the values of the array
         * 1- cumpolsary to specify the size of the array
         * 2- legal to have array with size zero
         * 3- declaring array with -ve size will result in creation of an array of -ve size
         * 4- allowed datatypes to specify size are: 
         *      1- byte:  byte b=10; int[] a= new int[b], 
         *      2- int:   int b=10; int[] a= new int[b], 
         *      3- short: short s=10; int[] a= new int[s], 
         *      4- char:  char b="A"; int[] a= new int[c]
         * 5- max array size is: int[] a=new int[2147483647] //gives out of memory error
         * 
        */

        System.out.println("");
        String a2[] = new String[3];
        a2[0]= "asit";
        a2[1]= "shas";
        a2[2]= "tri";
        for(int i=0;i<a2.length;i++)
        {
            System.out.print(a2[i]);
            System.out.print(" ");
        }



    }
}