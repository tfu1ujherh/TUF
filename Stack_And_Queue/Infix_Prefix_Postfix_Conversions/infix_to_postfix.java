package Stack_And_Queue.Infix_Prefix_Postfix_Conversions;

import java.util.Stack;

public class infix_to_postfix {
    public static void main(String[] args) {


        String exp="a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Postfix expression:"+solve(exp));

    }
    public static String solve(String exp){
        int n=exp.length();
        Stack<Character>stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() &&stack.peek()!='('){
                    res.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek()!='('){
                    System.out.println("Invalid expression");
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    res.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.toString();
    }


    public static int precedence(char ch){

        switch(ch){
            case '+','-':
              return 1;
            case '*','/':
              return 2;
            case '^':
              return 3;
        }
        return -1;
    }
    


}
