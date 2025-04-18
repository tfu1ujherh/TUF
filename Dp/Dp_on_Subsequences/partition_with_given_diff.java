package Dp.Dp_on_Subsequences;

public class partition_with_given_diff {

    static int mod = 1000000007;

    public static void main(String[] args) {
        int nums[] = {5, 2, 6, 4};
        int d = 3;

        System.out.println(solve(nums, d));
    }

    public static int solve(int nums[], int d) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // ✅ Fix the condition
        if (sum < d || (sum + d) % 2 != 0) {
            return 0;
        }

        int target = (sum + d) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = (dp[j] + dp[j - nums[i]]) % mod;
            }
        }

        return dp[target];
    }
}
