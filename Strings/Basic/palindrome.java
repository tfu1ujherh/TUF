package Strings.Basic;

public class palindrome {
    public static void main(String[] args) {
        
        String str="malayalam";

        System.out.println("Is palindrome :"+solve(str));
    }

    public static boolean solve(String str){

        String rev=new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){

            return true;
        
        }else{
            return  false;
        }
    }
}
