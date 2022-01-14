package stack;

import java.util.Stack;

public class find_the_rectangle_of_maximum_area_using_stack {
    public static int [] previous_small(int arr[]){
        int arr2[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i< arr.length;i++){
            int c=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                arr2[i]=-1;
            }
            else {
                arr2[i]=stack.peek();
            }
            stack.push(i);
        }
        return arr2;
    }

    public static int [] next_small(int arr[]){
        int arr2[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int c=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                arr2[i]=arr.length;
            }
            else {
                arr2[i]=stack.peek();
            }
            stack.push(i);
        }
        return arr2;
    }
    public static int max_area(int arr [] ){
        int previous_small[]=previous_small(arr);
        int next_small[]=next_small(arr);
        int max=0;
        for(int i=0;i<next_small.length;i++){
           int new_max= (next_small[i]-previous_small[i]-1)*arr[i];
           if(max<new_max){
               max=new_max;
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={6,2,5,4,5,1,6};
        System.out.println(max_area(arr));
    }
}
