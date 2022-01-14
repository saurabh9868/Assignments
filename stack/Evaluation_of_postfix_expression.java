package stack;

import java.util.Stack;

public class Evaluation_of_postfix_expression {
    public static void main(String[] args) {
        String a="231*+9-5+";
        Stack<Integer> stack=new Stack<>();
        char b;
        for(int i=0;i<a.length();i++){
             b=a.charAt(i);
            if(b=='*' ){
                int c=stack.pop()*stack.pop();
                stack.push(c);
            }
            else if( b=='/'){
                int c=stack.pop()/stack.pop();
                stack.push(c);
            }
            else if( b=='-'){
                int val1=stack.pop();
                int val2=stack.pop();
                int c=val2-val1;
                stack.push(c);
            }
            else if( b=='+'){
                int c=stack.pop()+stack.pop();
                stack.push(c);
            }
            else{

                int c=b-'0';
                stack.push(c);
            }
        }
        System.out.println(stack.peek());
    }
}

