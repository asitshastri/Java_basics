/**
 * break_statement
 */
public class break_statement {

    public static void main(String[] args) {
      for (int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
          System.out.print(j+" ");
          if(i==j) break;
        }
        System.out.println();
      }
    }
}