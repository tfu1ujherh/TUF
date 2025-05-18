package Easy;

public class linearsearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=5;
        boolean result=linearSearch(nums, k);
        System.out.println("Is element is prest in the array:"+result);
    }
    public  static  boolean linearSearch(int nums[],int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return true;
            }
        }
        return false;
    }
}
