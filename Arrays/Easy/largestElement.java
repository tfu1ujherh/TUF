package Arrays.Easy;

public class largestElement {
    public static void main(String[] args) {
        
        int nums[]={874,35274,587,3565};
        System.out.println("Largest Element in a array:"+maxelement(nums));
    }

    public static int maxelement(int nums[]){
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

}
