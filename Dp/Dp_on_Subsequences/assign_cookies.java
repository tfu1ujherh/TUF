package Dp.Dp_on_Subsequences;

import java.util.*;

public class assign_cookies {
    public static void main(String[] args) {
        
        int child[]={1,2,3};
        int cookie[]={1,1};

        System.out.println(solve(child, cookie));


    }

    public static int solve(int child[],int cookie[]){

        Arrays.sort(child);
        Arrays.sort(cookie);
        int m=child.length;
        int n=cookie.length;

        int i=0;
        int j=0;

        while(i<m && j<n){
            if(child[i]<=cookie[j]){
                i++;
            }
            j++;
        }

        return i;
    }
}
