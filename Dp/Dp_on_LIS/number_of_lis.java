package Dp.Dp_on_LIS;

import  java.util.*;

public class number_of_lis {
    public static void main(String[] args) {
        int nums[]={1,3,5,4,7};

        System.out.println(solve(nums));

    }

    public static int solve(int nums[]){
        int n=nums.length;

        int dp[]=new int[n];
        int count[]=new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(count,1);

        int maxLength=1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }else if(dp[i]==dp[j]+1){
                        count[i]=count[i]+count[j];
                    }
                }
            }
            maxLength=Math.max(maxLength,dp[i]);
        }

        int result=0;

        for(int i=0;i<n;i++){
            if(dp[i]==maxLength){
                result=result+count[i];
            }
        }

        return result;



    }
}
