package stack;

import java.util.Arrays;
import java.util.Stack;

public class find_next_greater_using_stack {
    public static void main(String[] args) {
        int arr[]={4,7,3,4,8,1};
        Stack<Integer> stack=new Stack<>();
        int arr2[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
            }
            if(stack.empty()){
                arr2[i]=-1;
            }
            else{
                arr2[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
