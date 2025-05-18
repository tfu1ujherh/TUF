package Easy;

public class movezerostoend {
    public static void main(String[] args) {
        
        int nums[]={2,0,6,9,3,0,0,8,6,3,0,5};
        movezeros(nums);
        System.out.println("Array after moving zeros to end:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void  movezeros(int nums[]){
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        while(k<nums.length){
            nums[k++]=0;
        }
    }
}
