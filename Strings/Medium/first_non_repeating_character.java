package Strings.Medium;

public class first_non_repeating_character {
    public static void main(String[] args) {
        
        String str="swiss";

        System.out.println("First Non-Repeating Character:"+solve(str));
    }

    public static char solve(String str){

        int freq[]=new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(freq[ch-'a']==1){

                return ch;

            }
        }

        return (char)-1;
    }
}
