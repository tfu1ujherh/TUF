package BackTracking;

import java.util.*;

public class combinations {
    public static void main(String[] args) {

        int n=4;
        int k=2;
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(n, k, 1, res, list);
        System.out.println(res);

    }

    public static void solve(int n,int k,int index,List<List<Integer>>res,List<Integer>list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n;i++){
            list.add(i);
            solve(n, k, i+1, res, list);
            list.remove(list.size()-1);
        }

    }
}
