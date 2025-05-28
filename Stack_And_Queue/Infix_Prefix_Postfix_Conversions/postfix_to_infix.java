package Stack_And_Queue.Infix_Prefix_Postfix_Conversions;

import java.util.Stack;

public class postfix_to_infix {
    public static void main(String[] args) {
        
        String exp="abc++";

        System.out.println("Infix expression:"+solve(exp));
    }


    public static String solve(String exp){
        int n=exp.length();

        Stack<String>stack=new Stack<>();

        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                if (stack.size() < 2) {
                    System.out.println("Invalid postfix expression");
                    return "";
                }
                String op1=stack.pop();
                String op2=stack.pop();
                String expression="("+op2+ch+op1+")";
                stack.push(expression);
            }
        }

        return stack.peek();
    }
}
