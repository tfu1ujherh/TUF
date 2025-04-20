package Dp.Dp_on_Stocks;

public class best_time_to_buy_and_sell_stock  {
    public static void main(String[] args) {

        int nums[]={7,1,5,3,6,4};
        System.out.println(solve(nums));
        
    }

    public static int solve(int nums[]){
    int min=0;
    int profit=0;

    for(int i=0;i<nums.length;i++){
        if(nums[min]>nums[i]){
            min=i;
        }
        profit=Math.max(profit,nums[i]-nums[min]);
    }
    return profit;
    }
}
