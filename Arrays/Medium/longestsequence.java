import java.util.Set;
import java.util.HashSet;
public class longestsequence {
    public static void main(String[] args) {
        int nums[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println("Length of the longest sequence:"+longestSequence(nums));
    }
    public static int longestSequence(int nums[]){
        Set<Integer>set=new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        int longest=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curnum=nums[i];
                int count=0;
                while(set.contains(curnum)){
                    curnum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return  longest;
    }
}
