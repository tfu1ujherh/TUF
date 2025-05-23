
import java.util.HashMap;
public class countsubarrayswithsum {
    public static void main(String[] args) {
        
        int nums[]={1,2,3};
        int k=3;
        System.out.println("Sub arrays with sum k:"+countSubArraysWithSum(nums, k));
    }
    public static int countSubArraysWithSum(int nums[],int k){
        HashMap<Integer,Integer>hmap=new HashMap<>();
        hmap.put(0,1);
        int count =0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(hmap.containsKey(sum-k)){
                count+=hmap.get(sum-k);
            }

            hmap.put( sum,hmap.getOrDefault(sum, 0)+1);


        }
        return count;
    }
}
