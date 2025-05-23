package Strings.Basic;

public class toggle_each_case {
    public static void main(String[] args) {
        
        String str="HeLLo";

        solve(str);

    }

    public  static void solve(String str){

        StringBuilder res=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
                // Lowercase to uppercase
                ch=(char)(ch-'a'+'A');
            }else if(ch >='A' && ch<='Z'){
                // Uppercase to lowercase

                ch=(char)(ch-'A'+'a');
            }
            res.append(ch);
           
        }

        System.out.println(res);
    }
}
