import java.util.HashMap;

class twosum{
    public static void main(String[] args) {
        int nums[]={56,89,35,2,569,45,8};
        int target=10;

        int result[]=findtwosum(nums, target);

        if(result!=null){
            System.out.println("Indices:" + result[0] + " and " +result[1]);
        }else{
            System.out.println("Twosum not found");
        }

    }
    public static int[] findtwosum(int nums[],int target){

        HashMap<Integer,Integer>hmap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int reqnum=target-nums[i];

            if(hmap.containsKey(reqnum)){
                return new int[]{hmap.get(reqnum),i};
            }
            hmap.put(nums[i], i);
        }
        return null;
    }
}