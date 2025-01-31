package Binary_Tree;
import java.util.*;

public class Level_Oreder_Treversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node createNode(int data){
        return new Node(data);
    }

    public static void levelOrder(Node root){ 
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr != null){
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            else{
                if(!q.isEmpty()){
                    q.add(null);
                }
                System.out.println();
            }
        }
      
    }

    public static void main(String[] args) {
        //
        //                     1
        //                   /   \
        //                 2     3
        //                / \   / \
        //               4   5 6   7
        //
     
        Node root = createNode(1);
        root.left = createNode(2);
        root.right = createNode(3);
        root.left.left = createNode(4);
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);
        System.out.println("Level Order Traversal: ");
        levelOrder(root);
    }
    
}
