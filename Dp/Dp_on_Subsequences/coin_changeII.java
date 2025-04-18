package Dp.Dp_on_Subsequences;

public class coin_changeII {
    public static void main(String[] args) {
        
        int coins[]={1,2,5};

        int amount=5;

        System.out.println(solve(coins, amount));

    }

    public static int solve(int coins[],int amount){

        int dp[]=new int[amount+1];

        dp[0]=1;

        for(int i=0;i<coins.length;i++){
            int coin=coins[i];

            for(int j=coin;j<=amount;j++){
                dp[j]=dp[j]+dp[j-coin];
            }
        }
        return dp[amount];

    }
}
