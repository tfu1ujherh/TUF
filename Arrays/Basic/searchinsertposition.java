public class searchinsertposition {
    public static void main(String[] args) {
        
        int nums[]={1,3,5,6};
        int num=10;
        int result=insertposition(nums, num);
        System.out.println("Element can insert at:"+result);


    }
    public static int insertposition(int nums[],int num){

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==num){
                return mid;
            }
            else if(nums[mid]<num){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        // If element not found
        return low;

    }
}
