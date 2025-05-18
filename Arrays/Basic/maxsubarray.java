public class maxsubarray {
    
    public static void main(String[] args) {
        
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxsub(nums);

        System.out.println("Maximum sum of a sub array :"+result);

    }
    public static int maxsub(int nums[]){

        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];

            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;

    }
}
