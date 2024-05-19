public class array2d {
    public static void main(String[] args) {
        int num[][]= new int[3][2];
        // printing the array values
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[1].length;j++)
            {
                num[i][j]= i+j;

            }
            System.out.println("");
        }
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[1].length;j++)
            {
                System.out.print(num[i][j]+" ");

            }
            System.out.println("");
        }
        /*Shortcut method to create 2d array */
        int num2[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[1].length;j++)
            {
                System.out.print(num2[i][j]+" ");

            }
            System.out.println("");
        }
    }
}
