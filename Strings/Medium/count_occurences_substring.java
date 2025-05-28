package Strings.Medium;

public class count_occurences_substring {
    public static void main(String[] args) {
        
        String str1="abababa";

        String str2="aba";
        System.out.println("Occurences:"+solve(str1,str2));

    }

    public static int solve(String str1, String str2) {
        int count = 0;
        int n = str2.length();
        int i=0;
        while(i<=str1.length()-n){

            if(str1.substring(i,i+n).equals(str2)){
                count++;
                i+=n;
            }else{
                i++;
            }

        }
        

        return count;
    }
}
