package array;

import java.util.LinkedList;

public class linked_list_palindrome_or_not {
    public static void main(String[] args) {
        LinkedList<Integer> sll=new LinkedList<Integer>();
        sll.add(5);
        sll.add(7);
        sll.add(7);
        sll.add(5);
       // ListNode previous=null;
        //ListNode current=head;
        //ListNode next=head.next;
        /*while(current!=null){
            current.next=previous;
            previous=current;
            current=next;
            next=next.next;
        }*/
        System.out.println(sll.get(1));
        LinkedList<Integer> sll2=new LinkedList<Integer>();
        for(int i= sll.size()-1,j=0;i>=0;i--,j++){
            sll2.add(sll.get(i));

        }
        System.out.println(sll2);
        if(sll==sll2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
