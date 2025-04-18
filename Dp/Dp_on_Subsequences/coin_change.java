package Dp.Dp_on_Subsequences;

public class coin_change {
    public static void main(String[] args) {
        
        int nums[]={1,2,5};
        int target=11;

        System.out.println(solve(nums, target));
    }

    public static int solve(int nums[],int target){


        int max=target+1;

        int dp[]=new int[target+1];

        for(int i=0;i<=target;i++){
            dp[i]=max;
        }
        dp[0]=0;

        for(int i=1;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                int coin=nums[j];

                if(coin<=i){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }

            }
        }

        if(dp[target]==max){
            return -1;
        }

        return dp[target];
    }
}
