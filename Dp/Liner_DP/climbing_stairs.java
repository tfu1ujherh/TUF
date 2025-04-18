package Dp.Liner_DP;

import java.util.*;

public class climbing_stairs {

    static int[] dp;  // for memoization

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Tabulation: " + climbTab(n));

        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Memoization: " + climbMemo(n));

        System.out.println("Space Optimized: " + climbSpace(n));
    }

    // 🔁 1. Tabulation (Bottom-Up)
    public static int climbTab(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;  // 1 way to stand at ground
        dp[1] = 1;  // 1 way to climb 1 step

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];  // One step or two steps
        }

        return dp[n];
    }

    // 🧠 2. Memoization (Top-Down)
    public static int climbMemo(int n) {
        if (n <= 1) return 1;

        if (dp[n] != -1) return dp[n];

        return dp[n] = climbMemo(n - 1) + climbMemo(n - 2);
    }

    // 🪶 3. Space Optimization (O(1) space)
    public static int climbSpace(int n) {
        if (n <= 1) return 1;

        int prev2 = 1;  // dp[0]
        int prev1 = 1;  // dp[1]
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
