public class apperanceonce {
    public static void main(String[] args) {
        
        int nums[]={4,1,2,1,2};
        System.out.println("The number which appear once is:"+apperanceOnce(nums));
    }

    public static int apperanceOnce(int nums[]){
        int result=0;

        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return  result;
    }
}
