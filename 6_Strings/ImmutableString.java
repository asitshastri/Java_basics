/**
 * ImmutableString
 * Any concatinated object does not get printed as String being immutable and any operation on already created string is stroed in a different object created inside the heap
 */
public class ImmutableString {

    public static void main(String[] args) {
        System.out.println("String Immutability");
        String name = "Asit";
        name.concat("Shastri");
        System.out.println(name);

        // String as object
        String name2 = new String("this is String");
        name2.concat("Creating using StringObject");
        System.out.println(name2);
    }
}
