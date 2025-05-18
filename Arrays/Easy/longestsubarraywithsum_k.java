public class longestsubarraywithsum_k {
    public static void main(String[] args) {
        int nums[]={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println("Longest Subarray with given Sum K(Positives):"+longestsubarray(nums, k));
    }
    public static int longestsubarray(int nums[],int k){
        int maxcount=0;
        int start=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>k){
                sum=sum-nums[start];
                start++;
            }

            if(sum==k){
                maxcount=Math.max(maxcount, i-start+1);
            }
            
        }
        return maxcount;

    }
}
