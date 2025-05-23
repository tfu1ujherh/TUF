package Strings.Medium;

import java.util.HashMap;

public class freqency_character {
    public static void main(String[] args) {
        
        String str="banana";

        solve(str);
    }

    public static void solve(String str){

        HashMap<Character,Integer>hamp=new HashMap<>();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            hamp.put(ch,hamp.getOrDefault(ch, 0)+1);

        }

        System.out.println(hamp);
    }
}
