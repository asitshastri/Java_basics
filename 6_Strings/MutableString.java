/**
 * MutableString
 */
public class MutableString {

    public static void main(String[] args) {
        System.out.print("Mutable Strings: Created using StringBuilder Class: ");

        // Creating String using StringBuilder
        StringBuilder city = new StringBuilder("Delhi");
        city.append("-06"); //no concat method in String object
        System.out.print(city);


    }
}