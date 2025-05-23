package Strings.Basic;

public class is_substring {
    public static void main(String[] args) {
        
        String str1="Ariga";

        String str2="gaa";

        System.out.println("Is substring:"+solve(str1, str2));
    }

    public static boolean  solve(String str1,String str2){

        
        if(str1.contains(str2)){
            return true;
        }


        return false;


    }
}
