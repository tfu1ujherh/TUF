package Numbers;

import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        solve(num);
    }

        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 

    public static void solve(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


}
