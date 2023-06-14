/**
 * Annotation:
 *  it ia a type of metadata that cabe added to a class,method, field, parameter, or other program element to provde additional information about the element.
 *  Annotation are used by the compiler, runtime, and other tools to generate code,perform runtime checks, and provide documentation and other information.
 *  Annotations are represented using the "@" symbol followed by the name of the annotation, and they can take parameters that provide additional information. 
 * 
 * Custom Annotation syntax: @interface <annotation_name> {
 *                                                          }
 */
// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;
// or
import java.lang.annotation.*;

/*Custom Annotation Creation */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //specify target of our annotation
@Retention(RetentionPolicy.RUNTIME) //specify power of annotation till runtime
@interface CricketPlayer  //Custom annotation similar to interface
{

    String country() default "India";
    int age() default 34;
    /*These values inside an annotation is retrieved using Reflection API*/


}

@CricketPlayer(age=60) 
class Virat
{
    @CricketPlayer (age=70)
    private int innings;
    private int runs;

    @CricketPlayer(age=80)
    public int getInnings() {
        return innings;
    }
    public void setInnings(int innings) {
        this.innings = innings;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }


}
public class Launch10_CustomAnnotation {
    public static void main(String[] args) {
        Virat v=new Virat();
        v.setInnings(300);
        v.setRuns(20000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c=v.getClass(); //getting class of v object
        Annotation a=c.getAnnotation(CricketPlayer.class); //getting annotation from calss
        CricketPlayer cp=(CricketPlayer)a; //as Annotation is Parent of Cricketplayer Therefore downcasting toCricketPlayer from Annotation.

        String country=cp.country(); //getting country
        System.out.println(country); 
        int age=cp.age(); ////getting age
        System.out.println(age);
    }
}