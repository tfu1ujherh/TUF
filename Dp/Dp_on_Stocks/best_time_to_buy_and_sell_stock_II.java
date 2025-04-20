package Dp.Dp_on_Stocks;

public class best_time_to_buy_and_sell_stock_II {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        System.out.println(solve(nums));

    }
    public static int solve(int nums[]){
        int profit=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                profit=profit+(nums[i]-nums[i-1]);
            }

        }
        return profit;
    }
}
