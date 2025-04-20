package Dp.Dp_on_Stocks;

public class best_time_to_buy_and_sell_stock_with_tax {
    public static void main(String[] args) {
        
        int nums[]={1,3,2,8,4,9};
        int fee=2;
    }

    public static int solve(int nums[],int fee){

        int hold=-nums[0];
        int profit=0;

        for(int i=1;i<nums.length;i++){
            hold=Math.max(hold,profit-nums[i]);
            profit=Math.max(profit,hold+nums[i]-fee);
        }
        return profit;
    }
}
