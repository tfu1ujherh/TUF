package BackTracking;

import java.util.*;

public class permutations {
    public static void main(String[] args) {
        
        int nums[]={1,2,3};
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        solve(nums, 0, res, list, visited);
        System.out.println(res);

    }

    public static void solve(int nums[],int index,List<List<Integer>>res,List<Integer>list,boolean  visited[]){

        if(list.size()==nums.length){
            res.add( new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i]=true;
                solve(nums, index+1, res, list, visited);
                list.remove(list.size()-1);
                visited[i]=false;
            }
        }
    }
}
