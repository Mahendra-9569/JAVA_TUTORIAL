package BST;

public class searching_in_bst {
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

    public static boolean search(Node root ,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }

        if(data < root.data){
            return search(root.left , data);
        }

        else{
            return  search(root.right, data);
        }

        

        
    

    }
    public static void printinRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data < k1){
            printinRange(root.right, k1, k2);
        }
        if(root.data >= k1 && root.data <= k2){

            System.out.print(root.data + " ");
            printinRange(root.left, k1, k2);
            printinRange(root.right, k1, k2);
        }
        if(root.data > k2){
            printinRange(root.left, k1, k2);
        }
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
        System.out.println();
        System.out.println(search(root, 5));
        printinRange(root , 2, 5);
    }
    
}
