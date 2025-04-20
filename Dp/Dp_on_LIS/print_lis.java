package Dp.Dp_on_LIS;
import  java.util.*;

public class print_lis {
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};
        List<Integer>lis=solve(nums);
        
        System.out.println(lis);
    }

    public static List<Integer>  solve(int nums[]){
        int n=nums.length;

        int dp[]=new int[n];
        int prev[]=new int[n];

        for(int i=0;i<n;i++){
            dp[i]=1;
            prev[i]=-1;

            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
        }

        int maxlength=0;
        int endIndex=0;

        for(int i=0;i<n;i++){
            if(dp[i]>maxlength){
                maxlength=dp[i];
                endIndex=i;
            }
        }

        List<Integer>lis=new ArrayList<>();

        while(endIndex!=-1){
            lis.add(nums[endIndex]);
            endIndex=prev[endIndex];
        }

        Collections.reverse(lis);

        return lis;
    }

}
