package Dp.Dp_on_Subsequences;

public class rod_cutting {
    public static void main(String[] args) {
        int nums[]={1, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(solve(nums));

    }

    public static int solve(int nums[]){
        int n=nums.length;

        int dp[]=new int[n+1];

        for(int i=1;i<=n;i++){
            int maxVal=Integer.MIN_VALUE;

            for(int j=0;j<i;j++){
                maxVal=Math.max(maxVal,nums[j]+dp[i-j-1]);

            }
            dp[i]=maxVal;

        }
        return  dp[n];
    }
}
