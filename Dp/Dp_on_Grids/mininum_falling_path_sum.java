package Dp.Dp_on_Grids;

public class mininum_falling_path_sum {
        public static void main(String[] args) {
            int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
            };
    
            // Call the method and print the result
            int result = minFallingPathSum(matrix);
            System.out.println("Minimum Falling Path Sum is: " + result);
        }
    
        public static int minFallingPathSum(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
    
            int[][] dp = new int[m][n];
    
            for(int i = 0; i < n; i++) {
                dp[m - 1][i] = matrix[m - 1][i];
            }
    
            for (int i = m - 2; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    int down = dp[i + 1][j];
                    int leftDiagonal = (j > 0) ? dp[i + 1][j - 1] : Integer.MAX_VALUE;
                    int rightDiagonal = (j < n - 1) ? dp[i + 1][j + 1] : Integer.MAX_VALUE;
    
                    dp[i][j] = matrix[i][j] + Math.min(down, Math.min(leftDiagonal, rightDiagonal));
                }
            }
    
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, dp[0][i]);
            }
    
            return min;
        }
    }
    

