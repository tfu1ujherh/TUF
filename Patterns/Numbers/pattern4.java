// package Numbers;

import java.util.*;
class pattern4{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        solve(n);

    }

        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20 21

    public static void solve(int n){
           for(int i=1;i<=n;i++){
            int start;
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=1;j<i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}


