/* print Star pattern of given below by using for loop:
       *
      *  *
    *  *  *
   *  *  *  *
 *  *  *   *  *
 */
import java.util.*;
public class StarPattern5{
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++){
            // int k is used for space only
            for(k=1;k<=(5-i);k++){
                System.out.printf(" ");
            }
            // int j is used for print *
            for(j=1;j<=i;j++){
                System.out.printf("* ");// put  sapce  after ("* ")
            }
            System.out.printf("\n");
        }



        // for above Pyramid we can also take input from user
     // for input use Scanner fuction
     // import java.util.*;

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the rows");
      int rows = sc.nextInt();
      for( i=1;i<=rows;i++){
         for(k=1;k<=(rows-i);k++){
            System.out.printf(" ");
         }
         for(j=1;j<=i;j++){
            System.out.printf("* ");
         }
         System.out.printf("\n");
      }
    }

}