/**
 * final Vs Immutability
 */
public class FinalVsImmutability {
    public static void main(String[] args) {
        /*What is final keyword?
         * When "final" keyword is used before creating a veriable then the default value of that variable will be fixed throught the program
         */
        // using final keyword: gives Error
        // final int var = 10;
        // var = 20;
        // if(var==10){
        //     System.out.println(var);
        // }
        // else{
        //     System.out.println("Variable Value changed to 20");
        // }
        
        // without using final variable
        int a=10;
        a=20;
        if(a==10){
            System.out.println("no change in the variable value");
        }
        else{
            System.out.println("Variable Value changed to 20");
        }


        /*Does "final" keyword affects the mutability of StringBuffer or StringBuilder?
         * No, it does affect the mutability and immutability of the StringBuffer or StringBuilder clas it only affects the varible defined pointing to the the object created. As in StringBuffer/StringBuilder the .append() method does changes within the same object therefore the immutablity does not gets affected.
        */
        final StringBuffer sb = new StringBuffer("Asit ");
        sb.append("Shastri");
        // System.out.println(sb);
        // creating new object and giving its address to sb, Willit work?
        sb = new StringBuffer("Sachin");// not possible because we used final keyword above therefore sb can only hold above object's reference only.
        System.out.println(sb);
    }
    
}