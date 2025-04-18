package Dp.Liner_DP;

public class frog_jumpII {
    public static void main(String[] args) {
        int nums[]={0,2,5,6,7};
        System.out.println(solve(nums));

    }

    public static int solve(int nums[]){

        int n=nums.length;
        int max=0;

        if(n==2){
            return nums[1]-nums[0];
        }
        for(int i=0;i<n-1;i++){
            max=Math.max(max, nums[i+1]-nums[i]);
        }

        for(int i=0;i<n-2;i++){
            max=Math.max(max, nums[i+2]-nums[i]);
        }
        return  max;
    }
}
