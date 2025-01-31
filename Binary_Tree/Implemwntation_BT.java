package Binary_Tree;

public class Implemwntation_BT {
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


    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }



    public static void main(String[] args) {
        Node root = createNode(1);
        root.left = createNode(2);
        root.right = createNode(3);
        root.left.left = createNode(4);
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);
        System.out.println("Preorder Traversal: ");
        preorder(root);
        
    }
    
}
