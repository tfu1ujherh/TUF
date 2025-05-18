
import java.util.HashMap;

public class longestsubarraywithnegwithsum_k {
    public static void main(String[] args) {
        int nums[]={10, 5, 2, 7, 1, -1, -3, 9};
        int k=15;
        System.out.println("Longest Subarray with sum K  [Postives and Negatives]:"+longestsubarray(nums, k));

        
    }
    public static int longestsubarray(int nums[],int k){

        HashMap<Integer,Integer>map=new HashMap<>();

        int sum=0;
        int max_length=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            if(sum==k){
                max_length=i+1;
            }

            if(map.containsKey(sum-k)){
                max_length=Math.max(max_length,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max_length;
    }


}
