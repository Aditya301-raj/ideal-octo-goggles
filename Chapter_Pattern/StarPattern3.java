import java.net.SocketTimeoutException;

/* print Star pattern of given below by using for loop:
  *
  **
  ****
  *****
  ******
 */
import java.util.*;
public class StarPattern3 {
    public static void main(String[] args) {
      int i;
      int j;
      for(i=1; i<=5;i++){
        for(j=1;j<=i;j++){
          System.out.printf("*");
        }
        System.out.printf("\n");
      }
      
     // for above Pyramid we can also take input from user
     // for input use Scanner fuction
     // import java.util.*;

     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the size of pyramid ");
     int rows = sc.nextInt();// here we can enter rows
     for( i=1; i<=rows;i++){
      for(j=1;j<=i;j++){
        System.out.printf("*");
      }
      System.out.printf("\n");
     }
     

    }
}