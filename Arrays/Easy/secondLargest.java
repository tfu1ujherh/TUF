package Arrays.Easy;

public class secondLargest {
    public static void main(String[] args) {
        int nums[]={100,100,100};
        System.out.println("Second largest element in an array:"+secondlargest(nums));
        
    }

    public static int secondlargest(int nums[]){

        int first_lar=Integer.MIN_VALUE;
        int second_lar=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>first_lar){
                second_lar=first_lar;
                first_lar=nums[i];

            } else if(nums[i]!=first_lar && nums[i]>second_lar){
                second_lar=nums[i];
            }
        }
        return second_lar;
    }


}
