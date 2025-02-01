package BST;

public class Implementation0fBST {
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

    public static Node   createBST(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = createBST(root.left, data);
        }
        else{
           root.right =  createBST(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        //                1
        //              /   \
        //             2     3
        //            / \   / \
        //           4   5 6   7
      int[] arr = {1,2,3,4,5,6,7};
        Node root = null ;

        for(int i = 0; i < arr.length; i++){
          root  =   createBST(root, arr[i]);
        }

        inorder(root);

        
        
    }
    
}
