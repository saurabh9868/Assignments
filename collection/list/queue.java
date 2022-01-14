package collection.list;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>() ;
        q.add(2);
        q.offer(4);
        q.add(5);
        q.offer(12);
        System.out.println(q.peek());


    }
}

