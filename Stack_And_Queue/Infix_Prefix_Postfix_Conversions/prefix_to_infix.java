package Stack_And_Queue.Infix_Prefix_Postfix_Conversions;

import java.util.Stack;

public class prefix_to_infix {
    public static void main(String[] args) {
        String exp="*-A/BC-/AKL";

        System.out.println("Infix expression:"+solve(exp));

    }

    public static String solve(String exp){
        int n=exp.length();

        Stack<String>stack=new Stack<>();

        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                String expression="("+op1+ch+op2+")";
                stack.push(expression);
            }
        }
        return stack.peek();
    }
}
