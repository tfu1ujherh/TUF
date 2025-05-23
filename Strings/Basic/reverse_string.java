package Strings.Basic;

public class reverse_string {
    
    public static void main(String[] args) {
        
        String str="Ariga Bhavani Shankar";

        // solve1(str);
        solve2(str);

    }

    public static void solve1(String str){
        int n=str.length();
        String res="";

        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            res+=ch;

        }
        System.out.println(res);
    }

    public static void solve2(String str){
        String rev=new StringBuilder(str).reverse().toString();

        System.out.println(rev);

        
    }


}
