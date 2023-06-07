public class StringConcatination {
    public static void main(String[] args) {
        String s1 = "Asit";
        String s2 = s1.concat(" Shastri");
        String s3 = new String("Asit");
        s3 = s3.concat(" Shastri");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*concatining int no with String
         * This converts the int number to a string
         */
        int a=10;
        String num = "Asit";
        System.out.println(num+a);

    }
}
