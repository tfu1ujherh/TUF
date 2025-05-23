package Strings.Basic;

import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        
        String str="programming";
        // solve1(str);
        solve2(str);

        
    }

    //without sequence

    public static void solve1(String str){
        StringBuilder res=new StringBuilder();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);

        Set<Character> set=new HashSet<>();

        for(int i=1;i<ch.length;i++){

            if(ch[i]==ch[i-1] && !set.contains(ch[i])){

                res.append(ch[i]);
                set.add(ch[i]);
            }
        }

        System.out.println("Duplicate characters:"+res.toString());
    }


    //with sequence


    public static void solve2(String str){

        HashSet<Character>seen=new HashSet<>();

        LinkedHashSet<Character> duplicates= new LinkedHashSet<>();


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(seen.contains(ch)){
                duplicates.add(ch);
            }else{
                seen.add(ch);
            }
        }

        System.out.print("Duplicate characters:");


        for(Character ch:duplicates){
            System.out.print(ch+" ");
        }



        
    }
}
