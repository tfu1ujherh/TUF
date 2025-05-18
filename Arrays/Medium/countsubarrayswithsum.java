public class countsubarrayswithsum {
    public static void main(String[] args) {
        
        int nums[]={1,2,3};
        int k=3;
        System.out.println("Sub arrays with sum k:"+countSubArraysWithSum(nums, k));
    }
    public static int countSubArraysWithSum(int nums[],int k){
        int count =0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==k){
                count++;
            }

        }
        return count;
    }
}
