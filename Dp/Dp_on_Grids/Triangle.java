package Dp.Dp_on_Grids;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = {
            {2},
            {3, 4},
            {6, 5, 7},
            {4, 1, 8, 8}
        };

        int result = minimumTotal(triangle);
        System.out.println("Minimum path sum from top to bottom: " + result);
    }

    public static int minimumTotal(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = triangle[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        return dp[0][0];
    }
}