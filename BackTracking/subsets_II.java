package BackTracking;

import java.util.*;

public class subsets_II {
    public static void main(String[] args) {
    int nums[]={1,2,2};

    List<List<Integer>>res=new ArrayList<>();
    List<Integer>list=new ArrayList<>();

    solve(nums, 0, res, list);

    System.out.println(res);

    }

    public static void solve(int nums[],int index,List<List<Integer>>res,List<Integer>list){

        res.add(new ArrayList<>(list));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            solve(nums, i+1, res, list);
            list.remove(list.size()-1);

        }

    }



    
}
