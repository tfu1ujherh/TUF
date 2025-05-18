import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        
        int nums[]={5,54,3,6,7,56,4};
        int k=60;

        int result[]=twoSum(nums, k);
        if(result!=null){
            System.out.println(result[0]+" ,"+result[1]);
        }else{
            System.out.println("Two sum not found");
        }
    }
    public static int[] twoSum(int nums[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int reqnum=k-nums[i];
            if(map.containsKey(reqnum)){
                return new int [] {map.get(reqnum),i};
            }
            map.put( nums[i],i);
        }
        return  null;
    }
}
