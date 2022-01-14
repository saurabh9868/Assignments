package collection.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> d= new ArrayDeque<>();
        d.offer(2);
        d.offer(3);
        d.offer(4);
        d.offer(20);
        d.offer(12);
        System.out.println(d.peekLast());
    }
}
