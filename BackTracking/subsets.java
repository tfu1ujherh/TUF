package BackTracking;
import java.util.*;

public class subsets {
    public static void main(String[] args) {
        
        int nums[]={1,2,3};
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(nums, 0, res, list);

        System.out.println(res);

    }
    public static void solve(int nums[],int i,List<List<Integer>>res,List<Integer>list){

        if(i==nums.length){
            res.add(new ArrayList<>(list));
        }else{
            list.add(nums[i]);
            solve(nums, i+1, res, list);
            list.remove(list.size()-1);
            solve(nums, i+1, res, list);

        }

    }
}
