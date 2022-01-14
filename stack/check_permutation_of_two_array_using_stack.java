package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class check_permutation_of_two_array_using_stack {
    public static void main(String[] args) {
        int  arr[]={ 1, 2, 3 };
        int arr2[]={ 3, 1, 2 };
        Queue<Integer> ip=new LinkedList<>();
        Queue<Integer> op=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            ip.add(arr[i]);
        }
        for(int j=0;j<arr2.length;j++){
            op.add(arr2[j]);
        }
        Stack<Integer> stack=new Stack<>();
        while(!ip.isEmpty()){
            int c= ip.poll();
            if(c== op.peek()){
                op.poll();
                while(!stack.isEmpty()){
                    if(stack.peek()== op.peek()){
                        stack.pop();
                        op.poll();
                    }
                    else {
                        break;
                    }
                }
            }
            else{
                stack.push(c);
            }

        }
        System.out.println(stack.empty());
    }
}
