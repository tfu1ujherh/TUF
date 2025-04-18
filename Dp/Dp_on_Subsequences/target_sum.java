package Dp.Dp_on_Subsequences;

public class target_sum {
    public static void main(String[] args) {
        
        int nums[]={1,1,1,1,1};

        int target=3;

        System.out.println(solve(nums, target));

        
    }


    public static int solve(int nums[],int target){

        int totalSum=0;

        for(int i=0;i<nums.length;i++){
            totalSum=totalSum+nums[i];
        }

        if((totalSum+target)%2!=0 || totalSum<Math.abs(target)){
            return 0;
        }

        int sum=(totalSum+target)/2;

        return countSubsets(nums, sum);


    }

    public  static int countSubsets(int nums[],int sum){

        int dp[]=new int[sum+1];
        dp[0]=1;

        for(int i=0;i<nums.length;i++){
            for(int j=sum;j>=nums[i];j--){
                dp[j]=dp[j]+dp[j-nums[i]];

            }
        }

        return dp[sum];

    }

}
