package Strings.Medium;

public class longest_word_in_sentence {
    public static void main(String[] args) {
        
        String str1="I love programming";

        System.out.println("Longest word in a sentence:"+solve(str1));


    }

    public static String solve(String str){

        String words[]=str.split("\\s+");

        String maxLen="";

        for(int i=0;i<words.length;i++){
            if(maxLen.length() <words[i].length()){
                maxLen=words[i];
            }
        }

        return maxLen;
    }
}
