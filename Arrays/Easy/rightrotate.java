package Easy;

public class rightrotate {
    
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5};
        int k=1;
        int result[]=rightRotate(nums, k);
        System.out.println("Array after left rotation:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    public static void reverse(int nums[],int low,int high){

        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }

    }
    public static int[] rightRotate(int nums[],int k){

        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        return nums;

    }
}
