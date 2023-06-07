class Reverse{
    public String rev(String str1,int axis)
    {
        if(axis==0)
        {
            String str2 = "";
            for(int i=str1.length()-1;i>=0;i--)
                {
                str2= str2 + str1.charAt(i);
                }
            return str2;
        }
        else if(axis==1)
        {
            String str2 = "";
            String aArr[]= str1.split(" ");
            for(String ele:aArr)
            {
                for(int i=ele.length()-1;i>=0;i--)
                {
                    str2= str2 + ele.charAt(i);
                }
                str2 += " ";
            }
            return str2;
        }
        else{
            String strerror = "Axos must be betwen 0 & 1.";
            return strerror;
        }
    }
    public String interChanger(String str1)
    {
        String str2 = "";
        String sArr[] = str1.split(" "); //str1 1 splited and converted to an array
        for(int i=sArr.length-1;i>=0;i--) // as sArr is an array therefore using ".length" property of array
        {
            str2 = str2+ sArr[i]+ " ";
        }
        return str2;
    }

}
public class StringReversal {
    public static void main(String[] args) {
        String str1 = "Asit Shastri";
        Reverse ulta = new Reverse();
        System.out.println(ulta.rev(str1,0));
        System.out.println(ulta.interChanger(str1));
        System.out.println(ulta.rev(str1,1));

}
}
