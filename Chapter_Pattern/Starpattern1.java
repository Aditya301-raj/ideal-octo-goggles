/* print Star pattern of given below by using for loop:
  ******
  ******
  ******
  ******
  ******
 */
import java.util.Scanner;
public class Starpattern1 {
    public static void main(String[] args) {
      
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("*");
                
            }
             System.out.printf("\n");
        }


    /* We can also take input from users by using Scanner function*/

    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Size of Pyramid");
    int N = sc.nextInt();
     for(int i=1;i<=N;i++){
         for(int j=1;j<=N;j++){
             System.out.printf("*");
             
         }
          System.out.printf("\n");
     }

    }
    }

    

