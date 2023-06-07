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
}
public class Aninymousarray1 {
    public static void main(String[] args) {
        System.out.println("Welcome! to Calulator");

        Calc obj = new Calc();
        // int num[] = {5,2,3,6};//as this array is only using once we can replce it by an anonymout array
        int result = obj.add(new int[]{5,2,3,6}); //array is directly sent to the method as a argument
        System.out.println(result);
        
    }
}
