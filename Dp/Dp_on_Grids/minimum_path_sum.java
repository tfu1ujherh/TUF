package Dp.Dp_on_Grids;

public class minimum_path_sum {
    public static void main(String[] args) {
        int nums[][]={{1,3,1},{1,5,1},{4,2,1}};

        System.out.println(solve(nums));
    }


    public static int solve(int nums[][]){
        
        int m=nums.length;
        int n=nums[0].length;

        int dp[][]=new int[m][n];

        dp[0][0]=nums[0][0];

        for(int i=1;i<m;i++){
            dp[i][0]=nums[i][0]+dp[i-1][0];
        }

        for(int j=1;j<n;j++){
            dp[0][j]=nums[0][j]+dp[0][j-1];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=nums[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[m-1][n-1];
    }
}
