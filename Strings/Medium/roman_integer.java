package Strings.Medium;

import java.util.HashMap;

public class roman_integer {
    public static void main(String[] args) {
        
        String str="V";


        System.out.println(solve(str));
    }


    public static int solve(String str){

        int n=str.length();

        HashMap<Character,Integer> hmap=new HashMap<>();

        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);

        int prev=0;

        int res=0;

        for(int i=str.length()-1;i>=0;i--){
            int cur=hmap.get(str.charAt(i));

            if(cur<prev){
                res-=cur;
            }else{
                res+=cur;
            }
            prev=cur;
        }


        return res;



    }
}
