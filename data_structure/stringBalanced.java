package data_structure;

import java.util.Scanner;
import java.util.Stack;

public class stringBalanced {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- !=0){
            String s=sc.nextLine();
            Stack<Character> stack=new Stack<>();
            boolean isbalanced=true;
            for(int i=0; i<=s.length();i++){
                Character ch=s.charAt(i);
                if (ch=='['||ch=='('||ch=='{'){
                    stack.push(ch);
                    continue;
                }
                if(stack.isEmpty()){
                    isbalanced=false;
                    break;
                }
                if(ch==')'){
                   if(stack.peek()=='('){
                       stack.pop();
                   }else {
                       isbalanced=false;
                   }
                }if(ch=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else {
                        isbalanced=false;
                    }
                }if(ch==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }else {
                        isbalanced=false;
                    }
                }
                if(stack.isEmpty()){
                    isbalanced=true;
                }if(!stack.isEmpty()){
                    isbalanced=false;
                }
                if(isbalanced){
                    System.out.println("balanced");
                }else{
                    System.out.println("not balanced");
                }

            }
        }
    }
}
