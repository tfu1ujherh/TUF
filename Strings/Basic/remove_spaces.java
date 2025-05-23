package Strings.Basic;

public class remove_spaces {
    public static void main(String[] args) {
        String str="Ariga Bhavani Shankar";
        solve(str);
    }

    public static void solve(String str){

        StringBuilder res=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch!=' '){
                res.append(ch);
            }
        }

        System.out.println(res.toString());
    }
}
