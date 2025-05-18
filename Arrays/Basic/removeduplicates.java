public class removeduplicates {
    
    public static void main(String[] args) {
        

        int nums[]={1,1,5,6,9,9,10,11,11};
        int result[]=new int[nums.length];
        int k=0;
        result[k++]=nums[0];

        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                result[k++]=nums[i];
                
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i=0;i<k;i++){
            System.out.print(result[i]+" ");
        }


    }
}
