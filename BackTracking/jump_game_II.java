package BackTracking;

public class jump_game_II {
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println("Min jumps:"+solve(nums));

    }
    public static int solve(int nums[]){

        int n=nums.length;

        if(n==1){
            return 0;
        }

        int jumps=0;
        int maxJump=0;
        int curJump=0;

        for(int i=0;i<n-1;i++){
            maxJump=Math.max(maxJump,i+nums[i]);

            if(i==curJump){
                jumps++;
                curJump=maxJump;
                if(curJump>=n-1){
                    return jumps;
                }
            }
        }
        return jumps;
    }
}
