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





// class Solution {
//     static int findTargetSumWays(int N, int[] A, int target) {
        
        
//         int sum=0;
//         for(int i=0;i<N;i++){
//             sum+=A[i];
//         }
        
//         if((sum+target)%2!=0 || sum<Math.abs(target)){
//             return 0;
//         }
        
//         int num=(sum+target)/2;
        
//         int dp[][]=new int[N+1][num+1];
        
//         dp[0][0]=1;
//         for(int i=1;i<=N;i++){
//             for(int j=0;j<=num;j++){
//                 dp[i][j]=dp[i-1][j];
                
//                 if(A[i-1]<=j){
//                     dp[i][j]=dp[i][j]+dp[i-1][j-A[i-1]];
//                 }
//             }
//         }
        
//         return dp[N][num];
        
//     }
// };