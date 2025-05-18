public class largestelement {
    public static void main(String[] args) {
        int nums[]={65,654,65,685,6858963,65};
        int result=largest(nums);
        System.out.print("Largest element in the array:"+result);
    }

    public  static int largest(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
