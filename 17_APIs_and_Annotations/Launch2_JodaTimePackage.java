/**
 * JodaTime API
 * Joda.org introduced new package for Date and time managament "java.time" package
 */
import java.time.*;
public class Launch2_JodaTimePackage {

    public static void main(String[] args) {
        System.out.println("java.time Package");
        System.out.println("***************************************************************************************************************************");

        System.out.println("LocalDate Class");
        System.out.println("Using 'javap java.time.LocalDate' cmd in terminal we know there is no constructor in this class");
        //as there is no constructor we cant use LocalDate() constructor to create an object
        /*creating object using now() method */
        LocalDate date = LocalDate.now();
        System.out.println("Date: "+date);
        System.out.println("");
        System.out.println("In-built Methods");

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        System.out.println("Day: "+day+", month: "+month+", year: "+year);

        System.out.println("***************************************************************************************************************************");

        System.out.println("LocalTime Class");
        LocalTime time = LocalTime.now();
        System.out.println("Time: "+time);
        System.out.println("");
        System.out.println("In-built Methods");

        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.println("Hours: "+hour+", minutes: "+min+", seconds: "+sec+", nano seconds: "+nano);
    }
}