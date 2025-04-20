package Dp.Dp_on_Strings;

public class l_palindromic_s {
    public static void main(String[] args) {
        
        String str="bbbab";
        System.out.println(solve(str));
        
    }

    public static int solve(String str){

        int m=str.length();

        String rev="";

        for(int i=m-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }

        int n=rev.length();

        int dp[][]=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return  dp[m][n];
    }
}
