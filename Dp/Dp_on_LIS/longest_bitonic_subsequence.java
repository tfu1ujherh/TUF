package Dp.Dp_on_LIS;

public class longest_bitonic_subsequence {
    public static void main(String[] args) {
        int nums[]={1, 2, 5, 3, 2};

        System.out.println(solve(nums));
    }

    public static int solve(int nums[]){
        int n=nums.length;

        int LIS[]=new int[n];
        int LDS[]=new int[n];

        for(int i=0;i<n;i++){
            LIS[i]=1;
            LDS[i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && LIS[i]<LIS[j]+1){
                    LIS[i]=LIS[j]+1;
                }
            }
        }

        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j] && LDS[i]<LDS[j]+1){
                    LDS[i]=LDS[j]+1;
                }
            }
        }

        int maxLength=0;

        for(int i=0;i<n;i++){
            maxLength=Math.max(maxLength,LIS[i]+LDS[i]-1);
        }

        return maxLength;
    }
}
