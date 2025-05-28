package Strings.Medium;

public class check_rotation {
    public static void main(String[] args) {
        
        String str1="ABCD";
        String str2="CDAB";
        System.out.println("Is rotated:"+solve(str1, str2));
    }
    public static boolean  solve(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        String merged=str1+str1;
        return merged.contains(str2);
    }
}
