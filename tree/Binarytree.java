package tree;
import java.util.*;
public class Binarytree {
    private static treeNode root;
    private class treeNode{
        private treeNode left;
        private treeNode right;
        private int data;
        public treeNode(int data) {
            this.data=data;
        }
    }
    public void createBinarytree() {
        treeNode first=new treeNode(1);
        treeNode second=new treeNode(2);
        treeNode third=new treeNode(3);
        treeNode fourth=new treeNode(4);
        treeNode fifth=new treeNode(5);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    /*  public void preorder(treeNode root) {
          if(root==null) {
              return;
          }
          treeNode temp=root;
          System.out.println(temp.data);
          preorder(root.left);
          preorder(root.right);
      }*/
    public void preorder(treeNode root) {
        if(root==null) {
            return;
        }
        Stack<treeNode> stack=new Stack<>();
        stack.push(root);
    }
    public static void main(String[] args) {
        Binarytree bt=new Binarytree();
        bt.createBinarytree();
        bt.preorder(bt.root);

    }
}

