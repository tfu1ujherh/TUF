public class secondlargest {
    
    public static void main(String[] args) {
        
        int nums[]={1,2,3,64,-5};

        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=nums[i];
            }
            else if(nums[i]!=firstLargest && nums[i]>=secondLargest){
                secondLargest=nums[i];
            }
        }

        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("There is no second largest elemnt present in the array");
        }else{
            System.out.println("Second largest element is :"+secondLargest);
        }
       


        


    }
}
