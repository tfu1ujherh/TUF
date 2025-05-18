package Easy;

public class secondlargest {
    public static void main(String[] args) {
        
        int nums[]={65,56,9856,6543,68,983,8689};
        int result=secondLargest(nums);
        System.out.println("Second largest:"+result);
    }
    public  static  int secondLargest(int nums[]){

        int first_largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>first_largest){
                second_largest=first_largest;
                first_largest=nums[i];
            }else if(nums[i]>second_largest && nums[i]!=first_largest){
                second_largest=nums[i];

            }

        }
        return second_largest;
    }
}
