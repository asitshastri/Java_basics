public class ExceptionHandeling1 {
    public static void main(String[] args) {
        int x=6;
        int y =3;
        int result = 0; //result in declared outside try cuz inside try its scope end in try block and it will always exception
        try {
            result = x/y;
            System.out.println("Result is:"+result);
        } 
        catch (Exception e) {
            System.out.println("Somethuing went wrong...");
        }
        System.out.println("oustside try"); //try writing normal statements outside try block
    }
}
