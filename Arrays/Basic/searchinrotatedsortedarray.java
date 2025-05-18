public class searchinrotatedsortedarray {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        
        int target=2;

        int result=searchsortedarray(nums, target);

        System.out.println("Element is present at:"+result);


    }

    public static int searchsortedarray(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[mid]>target && nums[low]<=target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }

            }

        }

        return -1;
    }
}
