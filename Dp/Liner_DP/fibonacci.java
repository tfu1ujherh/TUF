package Dp.Liner_DP;

import java.util.*;

public class fibonacci {
    static int[] dp; // Define globally for memoization

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Tabulation: " + fib(n));
        
        dp = new int[n + 1];               // Initialize once before calling memo()
        Arrays.fill(dp, -1);
        System.out.println("Memoization: " + memo(n));
        
        System.out.println("Space Optimized: " + space(n));
    }

    // 🔁 1. Tabulation (Bottom-Up)
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // 🧠 2. Memoization (Top-Down)
    public static int memo(int n) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        return dp[n] = memo(n - 1) + memo(n - 2);
    }

    // 🪶 3. Space Optimization
    public static int space(int n) {
        if (n <= 1) return n;

        int prev2 = 0, prev1 = 1, curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
