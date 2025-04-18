package BS_on_1D_Arrays;

public class first_and_last_position {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int first=firstpos(nums, target);
        int last=lastpos(nums, target);

        System.out.println(first+","+ last);

        

    }

    public static int firstpos(int nums[],int target){

        int low=0;
        int high=nums.length-1;
        int first=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }

    public static int lastpos(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;

        while (low<=high) {
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                last=mid;
                low=mid+1;
                
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return last;
    }



}
