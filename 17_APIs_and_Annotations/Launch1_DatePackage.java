/**
 * DatePackage:
 */
public class Launch1_DatePackage {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println("Date package in util: "+dt); //includes both date and timezone.

        /*getTime()- this method returns time in milliseconds */
        long timeInMilli = dt.getTime();
        System.out.println("Time in milliseconds: "+timeInMilli);

        java.sql.Date dt2 = new java.sql.Date(timeInMilli); //no zero parametarise constructor in this class
        System.out.println("Date package in sql: "+dt2);
        
    }
    
}