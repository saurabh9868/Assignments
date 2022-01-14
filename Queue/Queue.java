package Queue;

import java.util.Stack;

public class Queue {
    private Stack<Integer> stk1=new Stack<>();
    private Stack<Integer> stk2=new Stack<>();
    private int cur_size;
    public Queue(){
        cur_size=0;
    }
    public void offer(int x){
        stk1.push(x);
        cur_size++;
    }
    public int poll(){
        if(stk1.empty()){
            System.out.println("queue is null");
        }
        while(!stk1.empty()){
            stk2.push(stk1.peek());
            stk1.pop();
        }
        int a=stk2.peek();
        stk2.pop();
        while(!stk2.empty()){
            stk1.push(stk2.peek());
            stk2.pop();
        }
        return a;
    }

    public static void main(String[] args) {
        Queue q=new Queue();
       // System.out.println(q.poll());
        q.offer(4);
        q.offer(5);
        System.out.println(q.poll());
    }


}
