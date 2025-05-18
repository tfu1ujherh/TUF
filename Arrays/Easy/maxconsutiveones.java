public class maxconsutiveones {
    
    public static void main(String[] args) {
        int nums[]={1, 1, 0,1, 1, 1, 1};
        System.out.println("Max count of ones is:"+maxConsutiveOnes(nums));
    }
    public static int maxConsutiveOnes(int nums[]){

        int maxcount=0;
        int currentcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentcount++;
            }else if(nums[i]!=1){
                currentcount=0;
            }
            if(currentcount>maxcount){
                maxcount=currentcount;
            }

        }
        return  maxcount;
    }
}
