package Binary_Tree;

public class LCA2 {
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

    
    public static Node LCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);
        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        else{
            return right;
        }
    }
    public static void main(String[] args) {
        //                1
        //              /   \
        //             2     3
        //            / \   / \
        //           4   5 6   7
        Node root = null;
        int[] arr = {1,2,3,4,5,6,7};
        for(int i = 0; i < arr.length; i++){
            root = createBST(root, arr[i]);
        }
       System.out.println(LCA(root, 4, 6).data);
       
    }
    
}
