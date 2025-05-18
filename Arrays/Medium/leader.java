public class leader {
    public static void main(String[] args) {
        
        int nums[]={10, 22, 12, 3, 0, 6};
        int result[]=leaderarray(nums);

        for(int i=result.length-1;i>=0;i--){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] leaderarray(int nums[]){
        int temp[]=new int[nums.length];
        int k=0;
        int n = nums.length;
        int max=nums[n-1];
        temp[k++]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i] > max){
                max = nums[i];
                temp[k++]=nums[i];
            }
        }
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=temp[i];
        }
        return result;
    }
}
