package Strings.Medium;

public class find_substring_index {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println(solve(haystack, needle));
    }


    public static int solve(String str1,String str2){

        if(str2.length()==0){
            return 0;
        }

        for(int i=0;i<=str1.length()-str2.length();i++){

            if(str1.substring(i,i+str2.length()).equals(str2)){
                return i;
            }
        }


        return -1;
    }
}
