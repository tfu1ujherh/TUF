package Dp.Liner_DP;

public class House_RobberII {
    public static void main(String[] args) {
        
        int nums[]={2,3,2};

        System.out.println(solve(nums));
    }

    public static int solve(int nums[]){

        int n=nums.length;

        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n-1;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }

        int pd[]=new int [n];
        pd[1]=nums[1];
        pd[2]=Math.max(nums[1],nums[2]);

        for(int i=3;i<n;i++){
            pd[i]=Math.max(pd[i-2]+nums[i],pd[i-1]);
        }

        return Math.max(dp[n-2],pd[n-1]);
    }
    
}
