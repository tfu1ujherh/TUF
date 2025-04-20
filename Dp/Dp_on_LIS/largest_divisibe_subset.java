package Dp.Dp_on_LIS;

import java.util.*;

public class largest_divisibe_subset {
    public static void main(String[] args) {
        int nums[]={1,2,4,8};

        List<Integer>res=solve(nums);
        System.out.println(res);

    }
    public static List<Integer> solve(int nums[]){
        Arrays.sort(nums);

        int n=nums.length;

        int dp[]=new int[n];
        int prev[]=new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
        }
        int endIndex=0;
        int maxLength=0;
        
        for(int i=0;i<n;i++){
            if(dp[i]>maxLength){
                maxLength=dp[i];
                endIndex=i;
            }
        }

        List <Integer>lis=new ArrayList<>();

        while(endIndex!=-1){
            lis.add(nums[endIndex]);
            endIndex=prev[endIndex];
        }

        Collections.reverse(lis);

        return lis;


    }
}
