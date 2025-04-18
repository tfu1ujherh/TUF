package Dp.Dp_on_Grids;

public class unique_pathsII {
    public static void main(String[] args) {
        
        int nums[][]={{0,0,0,},{0,1,0},{0,0,0}};

        System.out.println(solve(nums));

    }

    public static int solve(int nums[][]){

        int m=nums.length;
        int n=nums[0].length;

        if(nums[0][0]==1){
            return  0;
        }

        int dp[][]=new int[m][n];

        dp[0][0]=1;

        for(int i=1;i<m;i++){
            dp[i][0]=(nums[i][0]==0 && dp[i-1][0]==1)?1:0;
        }

        for(int j=1;j<n;j++){
            dp[0][j]=(nums[0][j]==0 && dp[0][j-1]==1)?1:0;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(nums[i][j]==0){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[m-1][n-1];

    }
}
