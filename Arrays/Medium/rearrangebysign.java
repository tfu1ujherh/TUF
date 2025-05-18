public class rearrangebysign {
    public static void main(String[] args) {
        
        int nums[]={3,1,-2,-5,2,-4};
        int result[]=rearrangeBySign(nums);

        System.out.println("Array after rearraning with postive and negative sign's:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    public static int[] rearrangeBySign(int nums[]){

        int result[]=new int[nums.length];
        int postive=0;
        int negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[postive]=nums[i];
                postive=postive+2;
            }else{
                result[negative]=nums[i];
                negative=negative+2;
            }

        }
        return result;
    }
}
