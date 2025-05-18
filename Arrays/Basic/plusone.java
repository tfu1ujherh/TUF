public class plusone {
    public static void main(String[]args){

        int nums[]={9};
        int result[]=plusOne(nums);

        System.out.println("Array after adding One:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] plusOne(int []nums){

        int n=nums.length;

        for(int i=n-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int arr[]=new int[nums.length+1];
        arr[0]=1;
        return arr;
    }
}
