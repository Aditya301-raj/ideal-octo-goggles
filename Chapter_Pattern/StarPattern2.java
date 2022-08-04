
/* print Star pattern of given below by using for loop:
  *****
  ****
  ***
  **
  *
 */
import java.util.Scanner;


 public class StarPattern2 {
    public static void main(String[] args) {
        for(int i=5; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
  


     /* We can also take input from users by using Scanner function*/
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of rows");
      int N= sc.nextInt();
      for(int i=N; i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }

    }   
 }