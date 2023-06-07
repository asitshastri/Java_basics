/**
 * user_input
 */
import java.util.Scanner;
public class user_input {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String name = scan.next();
        System.out.println("Enter Phone no.: ");
        int num = scan.nextInt();
        System.out.println("username: "+name);
        System.out.println("Phone no: "+num);
        
    }
}