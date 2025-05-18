class demo{
    public static void main(String[] args) {

        int nums[]={65,654,35,6,0,650,565,65};
        int result=largestelement(nums);

        System.out.println(result);

        
    }
    public static int largestelement(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }



}