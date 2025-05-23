package Strings.Basic;

public class anagram {
    public static void main(String[] args) {
        
        String str1="listen";
        String str2="silent";

        System.out.println("Is anagram:"+solve(str1, str2));
    }

    public static boolean  solve(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }

        int freq[]=new int[26];

        for(int i=0;i<str1.length();i++){

            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;

        }


        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return  false;
            }
        }

        return true;
    }
}
