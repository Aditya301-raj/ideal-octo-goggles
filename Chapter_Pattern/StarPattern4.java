/* print Star pattern of given below by using for loop:
       *
      **
     ***
    ****
   *****
 */
import java.util.*;
public class StarPattern4{
    public static void main(String[] args) {
        int i;// i is for outter loop
      int j; // j is for inner  loop
      for(i=1; i<=5;i++){
        for(j=1;j<=5;j++){
          if((i+j)<=5){
            System.out.printf(" ");
          }
          else{
            System.out.printf("*");
          }
        }
        System.out.printf("\n");
      }
      
    // Another method to print pyramid
    // using Scanner method  

//       Scanner sc= new Scanner(System.in);
//      System.out.println("Enter the size of pyramid ");
//      int rows = sc.nextInt();// here we can enter rows

//      for(i=1; i<=rows;i++){
//         for(j=1;j<=rows;j++){
//           if((i+j)<=rows){
//             System.out.printf(" ");
//           }
//           else{
//             System.out.printf("*");
//           }
//         }
//         System.out.printf("\n");
//       }
      
    }
    
}
