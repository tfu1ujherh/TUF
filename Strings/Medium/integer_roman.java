package Strings.Medium;
public class integer_roman {
    
    public static void main(String[] args) {

        int num=1000;
        
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        System.out.println("Roman  of "+num+" is :"+solve(num, val, roman));


    }

    public static String solve(int num,int val[],String roman[]){

        int n=val.length;

        StringBuilder res=new StringBuilder();

        for(int i=n-1;i>=0;i--){
            while(val[i]<=num){
                num-=val[i];
                res.append(roman[i]);
                
            }
        }

        return res.toString();
    }
}
