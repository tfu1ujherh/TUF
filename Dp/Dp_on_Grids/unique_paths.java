package Dp.Dp_on_Grids;

public class unique_paths {
    public static void main(String[] args) {
        
        int m=3;
        int n=7;
        int dp[][]=new int[m][n];
        System.out.println(solve(m, n, dp));

    }

    public static int solve(int m,int n,int dp[][]){

        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];

            }
        }
        return  dp[m-1][n-1];

    }

    
}
