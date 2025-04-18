package Dp.Dp_on_Subsequences;

public class unbounded_knapsack {
    public static void main(String[] args) {
        
        int val[]={6, 1, 7, 7};
        int wt[]={1,2,4,5};
        int capacity=8;

        System.out.println(solve(val, wt, capacity));
    }

    public static int solve(int val[],int wt[],int capacity){

        int n=val.length;

        int dp[]=new int[capacity+1];

        for(int i=0;i<=capacity;i++){
            for(int j=0;j<n;j++){
                if(wt[j]<=i){
                    dp[i]=Math.max(dp[i],val[j]+dp[i-wt[j]]);
                }
            }
        }

        return dp[capacity];
    }
}
