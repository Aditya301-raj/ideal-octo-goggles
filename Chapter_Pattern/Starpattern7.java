
import java.util.*;
public class Starpattern7 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){// this loop for outer loop
            for(int k=1;k<=(5-i);k++){ // 'k' is use for sapce
                System.out.printf(" ");
            }
            for(int j=1;j<=2*i-1;j++){ // this loop for printing *
                System.out.printf("*");
            }
            System.out.printf(" \n");
        }



     //for above Pyramid we can also take input from user
        // for input use Scanner fuction
        // import java.util.*;
         
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the rows");
      int rows = sc.nextInt();

      for(int i=rows;i>=1;i--){
        for(int k=1;k<=(rows-i);k++){ 
            System.out.printf(" ");
        }
        for(int j=1;j<=2*i-1;j++){ 
            System.out.printf("*");
        }
        System.out.printf(" \n");
    }

       
    }
}
