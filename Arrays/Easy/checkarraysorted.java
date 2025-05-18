package Easy;
public class checkarraysorted {
    public static void main(String[] args) {
        int nums[]={65,69,96,365,895};
        boolean result=arraysorted(nums);
        System.out.println("Is Array is sorted:"+result);
    }
    public  static boolean arraysorted(int nums[]){

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    
}
