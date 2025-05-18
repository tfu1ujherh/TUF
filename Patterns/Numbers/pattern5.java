package Numbers;

import java.util.*;
public class pattern5 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        solve(n);


    }


// *       * | 1       9 | A       I
//  *     *  |  2     8  |  B     H 
//   *   *   |   3   7   |   C   G  
//    * *    |    4 6    |    D F   
//     *     |     5     |     E    
//    * *    |    4 6    |    D F   
//   *   *   |   3   7   |   C   G  
//  *     *  |  2     8  |  B     H 
// *       * | 1       9 | A       I

    public static void solve(int n){

        for(int i=1;i<=n;i++){

            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }

            for(int k=1;k<(n-i+1)/2;k++){
                System.out.print(" ");
            }
            for(int j=n;j>1;j--){
                System.out.print("*");
            }

            System.out.println();
        }

       
    }
}
