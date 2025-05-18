class removeelement{
    public static void main(String[]args){

        int nums[]={3,2,2,3};
        int k=0;
        int target=3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
                nums[k++]=nums[i];
            }

        }
        System.out.println("Updated length of an array:"+k);

    }
}