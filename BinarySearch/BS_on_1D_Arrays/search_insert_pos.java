package BS_on_1D_Arrays;

public class search_insert_pos {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=56;
        System.out.println("Element can be insert at index:"+insertpos(nums, target));
    }

    public static int insertpos(int nums[],int target){

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[low]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
