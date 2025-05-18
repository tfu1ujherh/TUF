public class missingelement {
    public static void main(String[] args) {
        
        int nums[]={5,3,0,1,2};

        int n=nums.length;
        int expectedSum= n*(n+1)/2;
        int resultSum=0;

        for(int i=0;i<nums.length;i++){
            resultSum=resultSum+nums[i];
        }
        int missingnum=expectedSum-resultSum;

        System.out.println("misiing element in the array is:"+  missingnum);


    }
}
