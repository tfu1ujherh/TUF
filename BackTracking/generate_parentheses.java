package BackTracking;

import java.util.*;

public class generate_parentheses {
    public static void main(String[] args) {
        
        int n=3;
        List<String>res=new ArrayList<>();
        String ans="";

        solve(n, res, ans, 0, 0);

        System.out.println(res);


    }

    public static void solve(int n,List<String>res,String ans,int open,int close){
        if(open==n && close==n){
            res.add(ans);
            return;
            
        }
        if(open<n){
            solve(n, res, ans+"(", open+1, close);
        }
        if(open>close){
            solve(n, res, ans+")", open, close+1);
        }
        
    }
}
