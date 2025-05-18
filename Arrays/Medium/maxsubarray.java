public class maxsubarray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Kadane's Algorithm : Maximum Subarray Sum in an Array:"+maxSubarray(nums));
    }
    public static int maxSubarray(int nums[]){
        int max=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
            if(cursum>max){
                max=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return max;
    }
}
