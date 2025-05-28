package Strings.Medium;


import java.util.*;
public class remove_duplicates {
    public static void main(String[] args) {

        String str= "programming";

        System.out.println("String After removing duplicates:"+solve(str));
    }
    public static String solve(String str){

        StringBuilder res=new StringBuilder();

        Set<Character>set=new HashSet<>();


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                res.append(ch);
                set.add(ch);

            }
           

            
            
        }

        return res.toString();

    
    }

}
