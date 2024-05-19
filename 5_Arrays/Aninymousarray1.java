class Calc
{
    public int add(int num[])
    {
        int sum=0;
        for(int i:num)
        {
            sum+=i;
        }
        return sum;
    }
    //method overloading 
    public int add(int num[][]){
        int sum=0;
        for (int element[]:num){
            for(int i:element){
                sum+=i;
            }
        }
        return sum;
    }
}
public class Aninymousarray1 {
    public static void main(String[] args) {
        System.out.println("Welcome! to Calulator");

        Calc obj = new Calc();
        // int num[] = {5,2,3,6};//as this array is only using once we can replce it by an anonymout array
        int result1 = obj.add(new int[]{5,2,3,6}); //array is directly sent to the method as a argument
        int result2 = obj.add(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println("Sum of 1d array= "+result1+"\n"+"Sum of 2d array= "+result2);
        
    }
}
