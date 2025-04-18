package Dp.Dp_on_Subsequences;

public class partition_equal_subset_sum {
    public static void main(String[] args) {
        
        int nums[]={1,5,11,5};
        System.out.println(solve(nums));

    }

    public static boolean solve(int nums[]){
        int sum=0;

        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            return  false;
        }

        int target=sum/2;

        boolean dp[][]=new boolean[n][target+1];

        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }

        if(nums[0]<=target){
            dp[0][nums[0]]=true;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=target;j++){

                boolean notTake=dp[i-1][j];

                boolean take=false;
                if(nums[i]<=j){
                    take=dp[i-1][j-nums[i]];
                }

                dp[i][j]=take||notTake;

            }
        }

        return dp[n-1][target];
    }
}
