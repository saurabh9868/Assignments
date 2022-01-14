package data_structure;

import org.w3c.dom.*;

import java.util.Scanner;

public class MyLinkedList {
    Node head;

   public void add(int data) {
        Node toadd = new Node(data);
        if (head == null) {
            head = toadd;

            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toadd;
    }

    public  void removelast() throws Exception{
       Node temp=head;
       if (temp==null){
           throw new Exception("cannot remove last element from empty stack");
       }
       if (temp.next==null){
           Node toRemove=head;
           head=null;
       }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
