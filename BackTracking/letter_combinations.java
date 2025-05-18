package BackTracking;

import java.util.*;

class letter_combinations{
    public static void main(String[] args) {
        
        String str="23";
        List<String>res=new ArrayList<>();
        String ans="";

        HashMap<Character,String>dail=new HashMap<>();
        dail.put('2',"abc");
        dail.put('3',"def");
        dail.put('4',"ghi");
        dail.put('5',"jkl");
        dail.put('6',"mno");
        dail.put('7',"pqrs");
        dail.put('8',"tuv");
        dail.put('9',"wxyz");

        solve(str, res, dail, ans, 0);
        System.out.println(res);
    }

    public static void solve(String str,List<String>res, HashMap<Character,String>dail,String ans,int i){
        if(i==str.length()){
            res.add(ans);
            return;
        }else{

        String pair=dail.get(str.charAt(i));

        for(int j=0;j<pair.length();j++){
            solve(str, res, dail, ans+pair.charAt(j), i+1);
        }
    }
    }

}




// Using StringBuilder- Optimal

/* 
package BackTracking;

import java.util.*;

class letter_combinations{
    public static void main(String[] args) {
        String str="23";

        HashMap<Character,String>dail=new HashMap<>();
        List<String>res=new ArrayList<>();
        StringBuilder ans=new StringBuilder();
        dail.put('2',"abc");
        dail.put('3',"def");
        dail.put('4',"ghi");
        dail.put('5',"jkl");
        dail.put('6',"mno");
        dail.put('7',"pqrs");
        dail.put('8',"tuv");
        dail.put('9',"wxyz");
        solve(str, res, dail, 0, ans);
        System.out.println(res);



    }
    public static void solve(String str,List<String>res,HashMap<Character,String>dail,int i,StringBuilder ans){
        if(i==str.length()){
            res.add(ans.toString());
            return;
        }else{
            String pair=dail.get(str.charAt(i));

            for(int j=0;j<pair.length();j++){
                ans.append(pair.charAt(j));
                solve(str, res, dail, i+1, ans);
                ans.deleteCharAt(ans.length()-1);
            }
        }
    }
}
    */