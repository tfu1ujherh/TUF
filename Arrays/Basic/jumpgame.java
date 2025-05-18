public class jumpgame {
    public static void main(String[] args) {
        
        int nums[]={3,2,1,0,4};
        boolean result=jumpGame(nums);

        System.out.println("Can Jump or not:"+result);

    }
    public static boolean jumpGame(int nums[]){
        int n=nums.length;

        if(n==1){
            return true;
        }
        if(nums[0]==0){
            return  false;
        }
        int max=0;
        for(int i=0;i<=max;i++){
            if(nums[i]+i>max){
                max=nums[i]+i;
                if(max>n-1){
                    return true;
                }

            }

        }
        return false;

    }
}
