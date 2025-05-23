package Strings.Basic;

public class count_vowels_consonants {
    
    public static void main(String[] args) {
        

        String str="Ariga";

        solve(str);
    }

    public static void solve(String str){
        str=str.toLowerCase();
        int vowels_count=0;
        int consonants_count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
            if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'){
                vowels_count++;
            }else{
                consonants_count++;
            }
        }
        }
        System.out.println("Vowels:"+vowels_count);
        System.out.println("Consonants:"+consonants_count);
    }
}
