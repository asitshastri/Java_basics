class RevRev{
    public String reving(String str1)
    {
        String str2 = "";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2 += str1.charAt(i);
        }
        return str2;
    }
}
class Palindrome{
    public void isPalindrome(String str1)
    {
        RevRev r = new RevRev();
        String revstr = r.reving(str1);
        if(str1.equalsIgnoreCase(revstr))
        {
            System.out.println(str1 + " is a Palindrome");
        }
        else{
            System.out.println(str1 + " is not a Palindrome");
        }
    }
}
/**
 * PalindromeCheck
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "2552";
        Palindrome p = new Palindrome();
        p.isPalindrome(input);
    }
}