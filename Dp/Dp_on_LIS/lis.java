package Dp.Dp_on_LIS;

public class lis {
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};
        System.out.println(solve(nums));
    }

    public static int solve(int nums[]){
        int n=nums.length;

        int dp[]=new int[n];

        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int maxLIS=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                maxLIS=Math.max(dp[i], maxLIS);
            }
        }


        return maxLIS;
    }

    
}
