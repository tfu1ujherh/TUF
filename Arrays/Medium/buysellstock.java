public class buysellstock {
    public static void main(String[] args) {
        
        int nums[]={7,1,5,3,6,4};
        System.out.println("Max profit is:"+buySellStock(nums));
    }
    public static int buySellStock(int nums[]){

        int buy=nums[0];
        int profit=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<buy){
                buy=nums[i];
            }else if(nums[i]-buy>profit){
                profit=nums[i]-buy;
            }
        }
        return profit;
    }
}
