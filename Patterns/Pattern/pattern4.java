package Pattern;

import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        solve(num);

          
    }

            *
        **
        ***
        ****
        *****

    public static void solve(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
