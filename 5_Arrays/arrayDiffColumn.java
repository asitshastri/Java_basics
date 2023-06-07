public class arrayDiffColumn {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        // array with same no of rows and duifferent no of columns
        int num[][]={
            {5,2,3,6},
            {8,3},
            {9,4,8}
        };


        // Iterating using Ehnanced loop
        for(int a[]:num)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }



        // using normal loop
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}
