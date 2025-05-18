package BackTracking;

import java.util.*;

public class combination_sum {
    public static void main(String[] args) {
        int nums[]={2,3,6,7};
        int target=7;

        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(nums, target, 0, res, list);
        System.out.println(res);

    }
    public  static void solve(int nums[],int target,int index,List<List<Integer>>res,List<Integer>list){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }
            list.add(nums[i]);
            solve(nums, target-nums[i], i, res, list);
            list.remove(list.size()-1);
        }
    }
}
