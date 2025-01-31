package Binary_Tree;


public class implementation_using_Array {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node createTree(int arr[]){
            idx++;
            if(idx == -1){
                return null;
            }
            Node root = new Node(arr[idx]);
            root.left = createTree(arr);;
            root.right = createTree(arr);
            return root;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1, -1, 2, 3, -1,-1, 4, 5,-1, 6, 7-1,-1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(arr);
        System.out.println(root.data);
        
    }
    
}
