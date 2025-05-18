class missingnumber{
    public static void main(String[] args) {
        int nums[]={5,3,2,6,0,1};
        System.out.println("Missing number is:"+ missing(nums));
        
    }
    public  static  int missing(int nums[]){
        int n=nums.length;

        int expected_sum=n*(n+1)/2;
        int resultent_sum=0;

        for(int i=0;i<nums.length;i++){
            resultent_sum=resultent_sum+nums[i];
        }
        int missing_number=expected_sum-resultent_sum;

        return missing_number;

    }
}