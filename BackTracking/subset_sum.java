package BackTracking;

import java.util.*;

public class subset_sum {

    public static void main(String[] args) {
        
        int nums[]={1,2,3};
        List<Integer>res=new ArrayList<>();
        solve(nums, 0, 0, res);

        System.out.println(res);


    }

    public static void solve(int nums[],int sum,int index,List<Integer>res){
        if(index==nums.length){
            res.add(sum);
            return;
        }
        solve(nums, sum+nums[index], index+1, res);
        solve(nums, sum, index+1, res);
    }
    
}
