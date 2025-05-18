package Easy;

public class removeduplcates {
    public static void main(String[] args) {
        int nums[]={12,36,36,56,89,89,100,100,100,656,1235};
        int k=duplcate(nums);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<k;i++){
            System.err.print(nums[i]+" ");
        }
    }

    public static int duplcate(int nums[]){
        if(nums.length==0){
            return  0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
            }
        }
        return  k;
    }
    
}
