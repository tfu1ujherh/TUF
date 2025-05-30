package Dp.Dp_on_Subsequences;

public class subset_sum_to_k {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int k = 4;
        System.out.println(solve(nums, k));
    }

    public static boolean solve(int nums[], int k) {
        int n = nums.length;

        // Fix 1: Correct DP table size (n x k+1)
        boolean dp[][] = new boolean[n][k + 1];

        // Base case: sum 0 is always possible (empty subset)
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Initialize for the first element
        if (nums[0] <= k) {
            dp[0][nums[0]] = true;
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= k; target++) {
                boolean notTake = dp[i - 1][target];
                boolean take = false;
                
                // Fix 2: Check nums[i] <= target (current sum), not k
                if (nums[i] <= target) {
                    take = dp[i - 1][target - nums[i]];
                }
                dp[i][target] = take || notTake;
            }
        }

        return dp[n - 1][k];
    }
}



//Method-2

// class Solution {
//     static Boolean isSubsetSum(int arr[], int sum) {
//         int n = arr.length;
//         boolean dp[][] = new boolean[n+1][sum+1];
        
//         // Base case: sum 0 can always be achieved with empty subset
//         dp[0][0] = true;
        
//         // Initialize first column (sum 0)
//         for(int i = 1; i <= n; i++) {
//             dp[i][0] = true;
//         }
        
//         // Fill the DP table
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= sum; j++) {
//                 if(arr[i-1] > j) {  // Corrected: using i-1 to access array
//                     dp[i][j] = dp[i-1][j];
//                 } else {
//                     dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
//                 }
//             }
//         }
        
//         return dp[n][sum];
//     }
// }